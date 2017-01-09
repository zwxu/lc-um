package com.zwxu.lc.um.cache;

import java.util.Map;

import net.rubyeye.xmemcached.MemcachedClient;

import org.apache.log4j.Logger;


public class MemeryCacheClient implements CacheClient{
	private Map<String,MemcachedClient> clientMap;
	
	private static final Logger    memcacheLogger = Logger.getLogger("memcache");

	

	public Object get(CacheType cacheType, String key) {
		try {
			return loadClient(cacheType).get(cacheType.getPrefix() + key);
		} catch (Exception e) {
			memcacheLogger.error("[" + cacheType.getPrefix() + key + "]获取异常", e);
			throw new RuntimeException("统一缓存访问异常");
		}
	}


	public void put(CacheType cacheType, String key, Object data, int expireSeconds) {
		try {
			loadClient(cacheType).set(cacheType.getPrefix() + key, expireSeconds, data);
		} catch (Exception e) {
			memcacheLogger.error("[" + cacheType.getPrefix() + key + "]设置异常", e);
			throw new RuntimeException("统一缓存访问异常");
		}
	}
	

	public Object remove(CacheType cacheType, String key) {
		throw new RuntimeException("暂不支持");
	}


	public void flush(CacheType cacheType) {
		try {
			loadClient(cacheType).flushAll();
		} catch (Exception e) {
			memcacheLogger.error("清理异常", e);
			throw new RuntimeException("统一缓存访问异常");
		}
	}


	private MemcachedClient loadClient(CacheType cacheType) {
		return clientMap.get(cacheType.getCode());
	}

	public void setClientMap(Map<String, MemcachedClient> clientMap) {
		this.clientMap = clientMap;
	}


	public void flushAll() {
		try {
			if(clientMap != null) {
				for(String key: clientMap.keySet()) {
					clientMap.get(key).flushAll();
				}
			}
		} catch (Exception e) {
			memcacheLogger.error("清理异常", e);
			throw new RuntimeException("统一缓存访问异常");
		}
		
	}
	
	

}
