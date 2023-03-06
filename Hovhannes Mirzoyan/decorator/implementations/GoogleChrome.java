package patterns.decorator.implementations;

import com.google.common.base.Preconditions;
import patterns.decorator.interfaces.Browser;
import patterns.decorator.models.Account;
import patterns.decorator.models.Tab;

import java.util.LinkedList;
import java.util.List;

public class GoogleChrome implements Browser {
    private Account account;
    private List<Tab> openedTabs;

    public GoogleChrome() {
        initializeTabs();
    }

    public GoogleChrome(Account account) {
        initializeTabs();
        this.account = account;
    }

    @Override
    public Integer openTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        Integer id = generateNewId();

        openedTabs.add(new Tab(id, url, title));
        System.out.println(String.format("Open tab with %s title", title));

        return id;
    }

    @Override
    public void closeTab(Integer id) {
        Preconditions.checkNotNull(id, "Tab id can not be null");

        openedTabs.removeIf(tab -> id.equals(tab.id()));
        System.out.println(String.format("Close tab with %d id", id));
    }

    @Override
    public Integer redirectToAnotherTab(String url, String title) {
        Preconditions.checkNotNull(url, "Tab url can not be null");
        Preconditions.checkNotNull(title, "Tab title can not be null");

        System.out.println(String.format("Redirected to tab with %s url", url));

        return openTab(url, title);
    }

    private Integer generateNewId() {

        Integer maxId = openedTabs.stream().map(Tab::id)
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalStateException("Can not find tab with max id."));


        return maxId + 1;
    }

    private void initializeTabs() {
        this.openedTabs = new LinkedList<>();
        this.openedTabs.add(new Tab(1, "", "New Tab"));
    }
}
