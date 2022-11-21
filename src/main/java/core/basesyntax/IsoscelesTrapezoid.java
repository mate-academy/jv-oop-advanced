package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double side;
    private double height;

    public IsoscelesTrapezoid(String color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((side + side) * height) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " units, side: " + this.side + " units, height: " + this.height + " units, color: " + getColor());
    }
}
