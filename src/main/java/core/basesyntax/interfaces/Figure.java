package core.basesyntax.interfaces;

import core.basesyntax.enums.Color;

public interface Figure extends Drawable, AreaCalculator {
    Color getColor();
}
