package com.zwxu.lc.um.cache;

import com.zwxu.lc.um.common.enums.CacheType;

public interface CacheClient {
  
    public static final int NEVER_EXPIRE = 0;

    /**
     * @param cacheType
     * @param key
     * @return
     */
    public Object get(CacheType cacheType, String key);

    /**
     * @param cacheType
     * @param key
     * @param data
     * @param expireSeconds
     */
    public void put(CacheType cacheType, String key, Object data, int expireSeconds);

    /**
     * @param cacheType
     * @param key
     * @return
     */
    public Object remove(CacheType cacheType, String key);

    /**
     * @param cacheType
     */
    public void flush(CacheType cacheType);
    
    /**
     * 
     */
    public void flushAll();
}
