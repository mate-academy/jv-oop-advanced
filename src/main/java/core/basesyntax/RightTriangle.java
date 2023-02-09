package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        super();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.area()
                + " sq.units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double area() {
        return 0.5 * secondLeg * Math.sqrt(Math.pow(firstLeg, 2) - Math.pow((secondLeg / 2), 2));
    }
}
