package patterns.decorator.interfaces;

public interface Browser {
    Integer openTab(String url, String title);

    void closeTab(Integer id);

    void redirectToAnotherTab(String url, String title);
}
