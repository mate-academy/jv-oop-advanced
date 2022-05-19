package core.basesyntax;

public class IsoscelesTrapezoid extends FigureClass {
    private final double base1;
    private final double base2;
    private final double side;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double side) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.side = side;
        this.setInfo("Figure: isosceles trapezoid, area: " + this.getArea() + " sq. units, base1: "
                + (int) this.base1 + " units, base2: " + (int) this.base2 + " units, side: "
                + (int) this.side + " units, color: " + this.getColor().toString().toLowerCase());
    }

    @Override
    public double getArea() {
        double halfPerimeter = side * 2 + base1 + base2;
        return Math.sqrt((halfPerimeter - base1) * (halfPerimeter - base2)
                * Math.pow(halfPerimeter - side, 2));
    }
}
