package com.qxam.watchers;

import com.qxam.auxiliary.driver.DriverManager;
import io.qameta.allure.Attachment;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

@RequiredArgsConstructor
public class ScreenshotWatcher implements TestWatcher {

    private final DriverManager driverManager;



    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        takeScreenshot(context.getDisplayName());
    }

    @Attachment(value = "{name}", type = "image/png")
    private byte[] takeScreenshot(String name) {
        return driverManager.takeScreenshot();
    }
}
