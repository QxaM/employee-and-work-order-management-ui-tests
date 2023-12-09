package com.qxam.auxiliary.driver;

import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;

import java.util.Optional;

public enum WebDriverType {
    CHROME,
    FIREFOX,
    EDGE,
    SAFARI;

    public static WebDriverType getDriverTypeFromSettings() {
        TestDataProperties data = DataProvider.get();
        Optional<String> browserTypeData = Optional.ofNullable(data.browserType());

        return WebDriverType.valueOf(
                browserTypeData.orElse(CHROME.name()).toUpperCase()
        );
    }
}
