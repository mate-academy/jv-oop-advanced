package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.area()
                + " sq.units, firstSide: " + this.firstSide
                + " units, secondSide: " + this.secondSide
                + " units, color: " + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }
}
