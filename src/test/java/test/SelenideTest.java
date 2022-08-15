package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    Service service = new Service();

    @BeforeEach
    void beforeTest(){
        open("https://github.com/selenide/selenide");
    }

    @Test
    void selenideTest(){
        service.openWiki();
        service.findSoftAssertions();
        service.searchJUnit();
    }
}
