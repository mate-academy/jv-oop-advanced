package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class IsoscelesTrapezoid extends Figure {
    private static final double CALCULATION_COEFFICIENT = 2.0;
    private double ceil;
    private double floor;
    private double side;

    public IsoscelesTrapezoid(Color color, double ceil, double floor, double side) {
        super(color);
        this.ceil = ceil;
        this.floor = floor;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (ceil + floor) * side / CALCULATION_COEFFICIENT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, ceil: " + ceil + " units, floor: "
                + floor + " units, side: "
                + side + " units, color: " + getColor().name());
    }
}
