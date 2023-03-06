package patterns.decorator.implementations;

import com.google.common.base.Preconditions;
import patterns.decorator.interfaces.Browser;

public class AvastSecureBrowserDecorator extends BrowserDecorator {

    public AvastSecureBrowserDecorator(Browser browser) {
        super(browser);
    }

    @Override
    public Integer openTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        checkIsSecure(url, title);

        return super.openTab(url, title);
    }

    @Override
    public void closeTab(Integer id) {
        Preconditions.checkNotNull(id, "Tab id can not be null");

        System.out.printf("AvastSecureBrowser: Close tab with %d id\n", id);
        super.closeTab(id);
    }

    @Override
    public Integer redirectToAnotherTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        checkIsSecure(url, title);
        return super.redirectToAnotherTab(url, title);
    }

    private void checkIsSecure(String url, String title) {
        System.out.println("Check is secure tab...");

        System.out.println(String.format("%s tab is secure.", title));
    }
}
