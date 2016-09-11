package com.zwxu.lc.um.cache.impl;

import java.util.Map;

import org.apache.log4j.Logger;

import com.zwxu.lc.um.cache.CacheClient;
import com.zwxu.lc.um.common.enums.CacheType;

import net.rubyeye.xmemcached.MemcachedClient;

public class MemeryCacheClient implements CacheClient {

  private static final Logger memcacheLogger = Logger.getLogger(MemeryCacheClient.class);

  private Map<String, MemcachedClient> clientMap;

  // 获取
  @Override
  public Object get(CacheType cacheType, String key) {

    try {
    	System.out.println("key:"+cacheType.getPrefix() + key);
      return loadClient(cacheType).get(cacheType.getPrefix() + key);
    } catch (Exception e) {
      memcacheLogger.error("[" + cacheType.getPrefix() + key + "]获取异常", e);
      throw new RuntimeException("统一缓存访问异常");
    }
  }

  // 存放
  @Override
  public void put(CacheType cacheType, String key, Object data, int expireSeconds) {

    try {
      loadClient(cacheType).set(cacheType.getPrefix() + key, expireSeconds, data);
    } catch (Exception e) {
      memcacheLogger.error("[" + cacheType.getPrefix() + key + "]设置异常", e);
      throw new RuntimeException("统一缓存设置异常");
    }
  }

  // 删除
  @Override
  public Object remove(CacheType cacheType, String key) {

    try {
      Object data = this.get(cacheType, key);
      loadClient(cacheType).delete(key);
      return data;
    } catch (Exception e) {
      memcacheLogger.error("cache 删除出错", e);
      throw new RuntimeException("删除出错");
    }
  }

  // 清理
  @Override
  public void flush(CacheType cacheType) {

    try {
      loadClient(cacheType).flushAll();
    } catch (Exception e) {
      memcacheLogger.error("清理异常", e);
      throw new RuntimeException("统一缓存访问异常");
    }
  }

  // 清理所有
  @Override
  public void flushAll() {

    try {
      if (clientMap != null) {
        for (String key : clientMap.keySet()) {
          clientMap.get(key).flushAll();
        }
      }
    } catch (Exception e) {
      memcacheLogger.error("清理异常", e);
      throw new RuntimeException("统一缓存访问异常");
    }

  }

  public void setClientMap(Map<String, MemcachedClient> clientMap) {

    this.clientMap = clientMap;
  }

  // 加载
  private MemcachedClient loadClient(CacheType cacheType) {

    return clientMap.get(cacheType.getCode());
  }
}
