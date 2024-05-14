package core.basesyntax.figures;

import core.basesyntax.util.AreaProvider;
import core.basesyntax.util.Colors;
import core.basesyntax.util.Drawable;

public abstract class Figure implements AreaProvider, Drawable {
    private static final int SCALE = 6;
    private static final int MIN = 1;
    private Colors color;
    private int randomNum = (int)(Math.random() * SCALE) + MIN;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public int getRandomNum() {
        return randomNum;
    }
}
