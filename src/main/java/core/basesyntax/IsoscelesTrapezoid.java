package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("This " + getColor() + " isosceles trapezoid has top side " + topSide
                + ", bottom side " + bottomSide + ", height " + height + " and area " + getArea());
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) * height / 2;
    }
}
