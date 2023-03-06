package patterns.decorator.implementations;

import com.google.common.base.Preconditions;
import patterns.decorator.interfaces.Browser;

/**
 * SpeedUpBrowserDecorator make improve your browser performance
 */
public class SpeedUpBrowserDecorator implements Browser {

    private final Browser browser;

    public SpeedUpBrowserDecorator(Browser browser) {
        this.browser = browser;
    }

    @Override
    public Integer openTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        makePerformanceImprovements();

        return this.browser.openTab(url,title);
    }

    @Override
    public void closeTab(Integer id) {
        Preconditions.checkNotNull(id, "Tab id can not be null");

        makePerformanceImprovements();
        this.browser.closeTab(id);
    }

    @Override
    public void redirectToAnotherTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        makePerformanceImprovements();
        this.browser.redirectToAnotherTab(url, title);
    }

    private void makePerformanceImprovements() {
        System.out.println("Make performance improvements");
    }
}
