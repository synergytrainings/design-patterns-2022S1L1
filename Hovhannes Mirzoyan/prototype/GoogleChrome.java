package patterns.prototype;

import patterns.prototype.interfaces.Browser;
import patterns.prototype.models.Tab;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class GoogleChrome implements Browser {

    private final List<Tab> openedTabs;

    public GoogleChrome() {
        openedTabs = new LinkedList<>();
    }

    @Override
    public void addTab(Tab tab) {
        openedTabs.add(tab);
    }

    @Override
    public Tab duplicateTab(String uuid) {
        Tab tab = findTabById(uuid);
        Tab duplicatedTab = tab.duplicate();

        duplicatedTab.setUuid(UUID.randomUUID().toString());
        openedTabs.add(duplicatedTab);

        return duplicatedTab;
    }

    private Tab findTabById(String uuid) {
        return openedTabs
                .stream()
                .filter(t -> t.getUuid().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("Tab with uuid %s not found", uuid)));
    }

}
