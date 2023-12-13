package com.qxam.config;

import org.aeonbits.owner.ConfigCache;

public class DataProvider {

  public static TestDataProperties get() {
    return ConfigCache.getOrCreate(TestDataProperties.class);
  }
}
