package com.aikax28.selenide.page;

import static com.codeborne.selenide.Selenide.*;

/**
 *
 * @author aikax28
 * @since 1.0.0
 */
public class GoogleResultPage {
    
    public void click() {
        click(0);
    }

    public void click(final int index) {
        $$("h3[class=LC20lb]").get(index).click();
    }
}
