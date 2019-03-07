package com.aikax28.selenide.page;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;
import javax.annotation.Nonnull;

/**
 *
 * @author aikax28
 * @since 1.0.0
 */
public class GooglePage {

    /* ---------------------------------------------------------------------- */
    /**
     *
     * @return google
     */
    /* ---------------------------------------------------------------------- */
    @Step("open google.")
    @Nonnull
    public static GooglePage open() {
        Selenide.open("https://www.google.com");
        return page(GooglePage.class);
    }

    /* ---------------------------------------------------------------------- */
    /**
     *
     * @param text search keyword
     * @return this
     */
    /* ---------------------------------------------------------------------- */
    @Step("sendkeys {text}")
    @Nonnull
    public GooglePage q(@Nonnull final String text) {
        $("input[name=q]").hover().val(text);
        return this;
    }

    /* ---------------------------------------------------------------------- */
    /**
     *
     * @return the search result page
     */
    /* ---------------------------------------------------------------------- */
    @Nonnull
    public GoogleResultPage search() {
        $("input[name=q]").hover().pressEnter();
        Wait().until(web -> Selenide.title().endsWith("Google 検索"));
        return page(GoogleResultPage.class);
    }

    /* ---------------------------------------------------------------------- */
}
