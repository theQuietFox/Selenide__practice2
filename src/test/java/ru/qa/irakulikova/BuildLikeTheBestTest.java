package ru.qa.irakulikova;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class BuildLikeTheBestTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void buildLikeTheBest() {
        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}