package patterns.decorator.implementations;

import patterns.decorator.interfaces.Browser;

public class BrowserDecorator implements Browser {
    private final Browser browser;

    public BrowserDecorator(Browser browser) {
        this.browser = browser;
    }

    @Override
    public Integer openTab(String url, String title) {
        return this.browser.openTab(url, title);
    }

    @Override
    public void closeTab(Integer id) {
        this.browser.closeTab(id);
    }

    @Override
    public Integer redirectToAnotherTab(String url, String title) {
       return this.browser.redirectToAnotherTab(url, title);
    }
}
