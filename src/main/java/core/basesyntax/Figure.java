package core.basesyntax;

import core.basesyntax.service.ColorSupplier;

public abstract class Figure implements CalculatorArea, Drawable {
    protected static final int MAX_VALUE = 100;
    protected String color = new ColorSupplier().getRandomColor();
}

