package com.zwxu.lc.um.cache;


public enum CacheType {
	
	PRODUCTION("production", "com.payment.lc.pcs.production", "产品信息"), 
	
	MAINTAIN("common", "com.payment.lc.pcs.maintain", "维护信息"), 
	
	NOTICE("common", "com.payment.lc.pcs.notice", "公告"), 
	
	APP_SETTING("common", "com.payment.lc.pcs.appSetting", "应用参数配置")
	
	;
	
    private final String code;
    private final String prefix;
    private final String message;

    /**
     * @param code
     * @param prefix
     * @param message
     */
    CacheType(String code, String prefix, String message) {
        this.code = code;
        this.prefix = prefix;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getMessage() {
        return message;
    }

    
    public static CacheType getByCode(String code){
    	for(CacheType cacheType : CacheType.values()){
    		if(cacheType.getCode().equals(code)){
    			return cacheType;
    		}
    	}
    	
    	return null;
    }
}

