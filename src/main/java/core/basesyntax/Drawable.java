package core.basesyntax;

import java.text.DecimalFormat;

public interface Drawable {
    DecimalFormat dF = new DecimalFormat("############.#");

    void draw();
}
