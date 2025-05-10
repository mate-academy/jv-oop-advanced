package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseSide;
    private double topSide;
    private double height;

    public IsoscelesTrapezoid(String color, double baseSide, double topSide, double height) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure isosceles trapezoid: color "
                + getColor() + ", area = " + calculateArea() + ", base side = " + baseSide
                + " units, top side = " + topSide
                + " units, height = " + height + " units");
    }

    @Override
    public double calculateArea() {
        return (baseSide + topSide) * height / 2;
    }
}
