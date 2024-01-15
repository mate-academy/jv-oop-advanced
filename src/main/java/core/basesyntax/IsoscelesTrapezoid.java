package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int side;

    public IsoscelesTrapezoid(String color, int base1, int base2, int side) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 4)
                * Math.sqrt(4 * side * side - (base2 - base1) * (base2 - base1));
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, Square: " + getArea()
                + " sq.units, Base1: " + base1
                + " units, Base2: " + base2
                + " units, Side: " + side
                + " units, Color: " + getColor();
    }
}
