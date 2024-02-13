package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw(Figure rectangle) {
        System.out.println("Figure: rectangle, area: " + getArea(rectangle) + " sq. units, "
                + "first side: " + firstSide + " units, "
                + "second side: " + secondSide + " units, "
                + "color: " + rectangle.color);
    }

    @Override
    public double getArea(Figure figure) {
        return firstSide * secondSide;
    }
}
