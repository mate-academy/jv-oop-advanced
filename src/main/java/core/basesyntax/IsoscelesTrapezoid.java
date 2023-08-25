package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double side;
    private double secondSide;

    public IsoscelesTrapezoid(String color, double height, double side, double secondSide) {
        super(color);
        this.height = height;
        this.side = side;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, " + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + side + " units, "
                + "secondLeg: " + secondSide + ", height: " + height + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((side + secondSide) / 2) * height;
    }
}
