package com.aikax28.selenide.report;

import com.aikax28.selenide.page.GooglePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.qameta.allure.selenide.AllureSelenide;

/**
 *
 * @author aikax28
 * @since 1.0.0
 * @see <a href="https://docs.qameta.io/allure/">allure</a>
 */
// @ExtendWith(TextReportExtension.class)
class GoogleTests {

    /* ---------------------------------------------------------------------- */
    /**
     * setup
     */
    /* ---------------------------------------------------------------------- */
    @BeforeEach
    public void setup() {
        Configuration.fastSetValue = true;
        Configuration.reportsFolder = "D:/selenide";
        Configuration.holdBrowserOpen = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    /* ---------------------------------------------------------------------- */
    /**
     *
     */
    /* ---------------------------------------------------------------------- */
    @Test
    @Description("google search")
    void test() {
        GooglePage.open()
                .q("aikax28")
                .search()
                .click();
    }

    /* ---------------------------------------------------------------------- */
}
