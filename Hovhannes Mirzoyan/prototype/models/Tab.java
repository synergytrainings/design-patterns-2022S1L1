package patterns.prototype.models;

import patterns.prototype.interfaces.Duplicable;

public class Tab implements Duplicable<Tab> {

    private String uuid;

    private final String url;

    private final String title;

    private CursorPosition cursorPosition;

    public Tab(String  uuid, String url, String title) {
        this.uuid = uuid;
        this.url = url;
        this.title = title;
        this.cursorPosition = new CursorPosition(0,0);
    }

    public Tab(Tab tab) {
        this.uuid = tab.uuid;
        this.url = tab.url;
        this.title = tab.title;
        this.cursorPosition = tab.cursorPosition.duplicate();
    }

    public String getUuid() {
        return uuid;
    }


    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public CursorPosition getCursorPosition() {
        return cursorPosition;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCursorPosition(CursorPosition cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    @Override
    public Tab duplicate() {
        return new Tab(this);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tab{");
        sb.append("uuid='").append(uuid).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", cursorPosition=").append(cursorPosition);
        sb.append('}');
        return sb.toString();
    }
}
