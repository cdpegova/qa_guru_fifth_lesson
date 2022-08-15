package test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Service {

    static final String wiki = "[id=\"wiki-tab\"]";
    static final String pagesBox = "[id=\"wiki-pages-box\"]";
    static final String content = "[id=\"wiki-content\"]";
    static final String welcomeToWiki = ".markdown-body";

    public void openWiki() {
        $(wiki).click();
        $(welcomeToWiki).shouldHave(text("wiki"));
    }

    public void findSoftAssertions() {
        $(pagesBox).$(withText("more pages…")).click();
        $(pagesBox).$(withText("SoftAssertions")).click();
    }

    public void searchJUnit() {
        $(content).shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }

}
