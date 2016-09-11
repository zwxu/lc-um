package com.zwxu.lc.um.cache;

import javax.annotation.Resource;
import org.apache.log4j.Logger;

import com.zwxu.lc.um.common.enums.CacheType;

public class CacheTemplate {

  private static final Logger logger = Logger.getLogger(CacheTemplate.class);

  private static final int DEFAULT_EXPIRE_SECONDS = CacheClient.NEVER_EXPIRE;

  @Resource(name = "cacheClient")
  private CacheClient cacheClient;

  public Object get(CacheType cacheType, String key) {

    Object value = null;
    try {
      value = cacheClient.get(cacheType, key);
    } catch (Exception e) {
      logger.info("[" + key + "]缓存获取信息异常," + value + "-{}", e);
    }
    return value;
  }

  public void put(CacheType cacheType, String key, Object object, int expireSeconds) {

    if (object == null) {
      logger.info("[" + key + "]缓存信息异常,不能为空");
    }
    if (expireSeconds == 0) {
      expireSeconds = DEFAULT_EXPIRE_SECONDS;
    }
    try {
      cacheClient.put(cacheType, key, object, expireSeconds);
    } catch (Exception e) {
      logger.info("统一缓存put异常，KEY：" + key + "-{}", e);
    }
  }

  // 生成key
  public String cacheKey(final String methodName, final Object[] args) {

    StringBuffer keyBuffer = new StringBuffer(methodName);
    if ((args != null) && (args.length != 0)) {
      keyBuffer.append("-");
      for (int i = 0; i < args.length; i++) {
        if ((args[i] instanceof Integer) || (args[i] instanceof String) || (args[i] instanceof Long)
            || (args[i] instanceof Enum) || (args[i] instanceof Boolean)) {
          keyBuffer.append(args[i].toString());
        } else {
          try {
            keyBuffer.append(args[i].toString());
          } catch (RuntimeException e) {
            logger.info("Need to Override toString() except String,Long and Integer", e);
            throw e;
          }
        }
        if (i != (args.length - 1)) {
          keyBuffer.append("_");
        }
      }
    }
    return keyBuffer.toString();
  }
}
