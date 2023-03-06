package patterns.decorator;


import patterns.decorator.implementations.AvastSecureBrowserDecorator;
import patterns.decorator.implementations.GoogleChrome;
import patterns.decorator.implementations.SpeedUpBrowserDecorator;
import patterns.decorator.interfaces.Browser;

public class Main {

    public static void main(String[] args) {
        Browser browser = new GoogleChrome();

        Integer googleId = browser.openTab("https://example.com", "Example for Google Chrome");
        browser.redirectToAnotherTab("https://facebook.com","Example for Facebook" );
        browser.closeTab(googleId);
        System.out.println();

        //decorate google chrome
        Browser avastSecure = new AvastSecureBrowserDecorator(new GoogleChrome());
        Integer yandexId = avastSecure.openTab("https://yandex.com", "Example for Yandex");
        avastSecure.redirectToAnotherTab("https://instagram.com","Example for Instagram" );
        avastSecure.closeTab(yandexId);
        System.out.println();

        //decorate avast decorator with speed up browser
        Browser speedUpBrowser = new SpeedUpBrowserDecorator(new AvastSecureBrowserDecorator(new GoogleChrome()));
        Integer chatGptId = speedUpBrowser.openTab("https://open.chatgpt.com", "Example for ChatGPT");
        speedUpBrowser.redirectToAnotherTab("https://github.com","Example for GitHub" );
        speedUpBrowser.closeTab(chatGptId);
        System.out.println();
    }
}
