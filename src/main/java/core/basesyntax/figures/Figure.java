package core.basesyntax.figures;

import core.basesyntax.util.AreaProvider;
import core.basesyntax.util.ColorSupplier;
import core.basesyntax.util.Colors;
import core.basesyntax.util.Drawable;

public abstract class Figure implements AreaProvider, Drawable {
    private static final int SCALE = 6;
    private static final int MIN = 1;
    private Colors color;
    private int randomNum = (int)(Math.random() * SCALE) + MIN;

    public Figure() {
        this.color = ColorSupplier.getRandomColor();
    }

    public int getRandomNum() {
        return randomNum;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }

    public Colors getColor() {
        return color;
    }
}
