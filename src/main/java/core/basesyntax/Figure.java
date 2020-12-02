package core.basesyntax;

import core.basesyntax.constant.Color;
import core.basesyntax.producers.ColorProducer;

public abstract class Figure implements Drawable {
    private Color color;

    public Color getColor() {
        return ColorProducer.getColor();
    }

}
