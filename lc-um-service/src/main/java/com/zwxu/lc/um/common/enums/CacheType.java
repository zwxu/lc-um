package com.zwxu.lc.um.common.enums;

public enum CacheType {

  FCOUPON("common", "com.payment.lc.fcoupon", "活动配券");

  private final String code;

  private final String prefix;

  private final String message;

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

  public static CacheType getByCode(String code) {

    for (CacheType cacheType : CacheType.values()) {
      if (cacheType.getCode().equals(code)) {
        return cacheType;
      }
    }
    return null;
  }
}
