package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class GeometricFigure implements AreaCalculator, Drawable {
    private String color;

    public GeometricFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure");
    }
}
