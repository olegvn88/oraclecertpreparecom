package ke.patterns.factory_method.factory;

import ke.patterns.factory_method.buttons.Button;
import ke.patterns.factory_method.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}