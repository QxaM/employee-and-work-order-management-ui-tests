package com.qxam.auxiliary.driver;

import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum WebDriverType {
  CHROME,
  FIREFOX,
  EDGE,
  SAFARI;

  public static WebDriverType getDriverTypeFromSettings() {
    TestDataProperties data = DataProvider.get();
    log.info("Set browser type: " + data.browserType());
    Optional<String> browserTypeData = Optional.ofNullable(data.browserType());

    return WebDriverType.valueOf(browserTypeData.orElse(CHROME.name()).toUpperCase());
  }
}
