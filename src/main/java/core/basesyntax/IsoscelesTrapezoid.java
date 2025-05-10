package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstSide;
    private int secondSide;

    public IsoscelesTrapezoid(String color, int height, int firstSide, int secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq.units, height: " + this.height + " units, firstSide: "
                + this.firstSide + " units, secondSide: " + this.secondSide
                + " units, color: " + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
