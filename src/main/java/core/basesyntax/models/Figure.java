package core.basesyntax.models;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.models.painter.Color;
import core.basesyntax.models.painter.ColorSupplier;
import java.util.Random;

public abstract class Figure implements Drawable {
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final double PROPERTY_MULTIPLIER = 10;
    protected final ColorSupplier colorSupplier = new ColorSupplier();
    protected final Random random = new Random();
    protected String color = DEFAULT_COLOR;

    public abstract double get_area();

    public Figure setRandomProperties() {
        color = colorSupplier.getRandomColor();
        return this;
    }
}
