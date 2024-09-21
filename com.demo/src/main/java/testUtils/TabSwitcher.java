package testUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import java.util.Set;

public class TabSwitcher {

    public static void switchToTab(WebDriver driver, String title) {
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(title)) {
                return; // Switch to the tab with the matching title
            }
        }

        // If no tab matches, switch back to the original tab
        driver.switchTo().window(currentWindowHandle);
        System.out.println("No tab with title: " + title);
    }
}