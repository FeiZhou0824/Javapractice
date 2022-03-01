package day45_Abstaction.browsersTask;

public interface WebDriver extends SearchContext{

    void get(String url);
    void close();
    void quit();
    void getTitle();

}
