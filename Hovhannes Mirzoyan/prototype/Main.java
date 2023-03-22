package patterns.prototype;

import patterns.prototype.interfaces.Browser;
import patterns.prototype.models.Tab;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Browser browser = new GoogleChrome();
        Tab firstTab = new Tab(UUID.randomUUID().toString(), "https://example.com", "Title");
        browser.addTab(firstTab);

        Tab duplicatedTab  = browser.duplicateTab(firstTab.getUuid());
        System.out.println(duplicatedTab);
    }
}
