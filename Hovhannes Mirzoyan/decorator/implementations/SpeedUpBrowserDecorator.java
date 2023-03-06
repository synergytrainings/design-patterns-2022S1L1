package patterns.decorator.implementations;

import com.google.common.base.Preconditions;
import patterns.decorator.interfaces.Browser;

/**
 * SpeedUpBrowserDecorator make improve your browser performance
 */
public class SpeedUpBrowserDecorator extends BrowserDecorator {

    public SpeedUpBrowserDecorator(Browser browser) {
        super(browser);
    }

    @Override
    public Integer openTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        makePerformanceImprovements();

        return super.openTab(url,title);
    }

    @Override
    public void closeTab(Integer id) {
        Preconditions.checkNotNull(id, "Tab id can not be null");

        makePerformanceImprovements();
        super.closeTab(id);
    }

    @Override
    public Integer redirectToAnotherTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        makePerformanceImprovements();
        return super.redirectToAnotherTab(url, title);
    }

    private void makePerformanceImprovements() {
        System.out.println("Make performance improvements");
    }
}
