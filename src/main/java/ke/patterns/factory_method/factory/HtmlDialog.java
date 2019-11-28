package ke.patterns.factory_method.factory;

import ke.patterns.factory_method.buttons.Button;
import ke.patterns.factory_method.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}