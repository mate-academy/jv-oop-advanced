package core.basesyntax.figure;

import core.basesyntax.supplier.AreaCalculator;
import core.basesyntax.supplier.Color;
import core.basesyntax.supplier.Drawable;

public class Figure implements Drawable, AreaCalculator {
    private final String figureName;
    private final Color color;

    public Figure(Color color, String figureName) {
        this.color = color;
        this.figureName = figureName;
    }

    public Color getColor() {
        return color;
    }

    public String getFigureName() {
        return figureName;
    }

    @Override
    public void draw() {
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
