package core.basesyntax;

import java.util.Random;

public abstract class FigureSupplier implements AreaCalculable, Drawable {
    private Random random = new Random();

    private String color;

    public FigureSupplier(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
