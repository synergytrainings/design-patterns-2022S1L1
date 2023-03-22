package patterns.prototype.interfaces;

import patterns.prototype.models.Tab;

public interface Browser {

    void addTab(Tab tab);
    Tab duplicateTab(String uuid);

}
