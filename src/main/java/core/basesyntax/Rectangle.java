package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq.units, firstSide: " + this.firstSide
                + " units, secondSide: " + this.secondSide
                + " units, color: " + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
