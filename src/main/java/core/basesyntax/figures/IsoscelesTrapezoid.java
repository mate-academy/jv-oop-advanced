package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double ceil;
    private double floor;
    private double side;
    public IsoscelesTrapezoid(String color, double ceil, double floor, double side) {
        super(color);
        this.ceil = ceil;
        this.floor = floor;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (ceil + floor) * side / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, ceil: " + ceil + " units, floor: "
                + floor + " units, side: "
                + side + " units, color: " + getColor());
    }
}
