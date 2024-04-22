package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, top side:" + topSide + ", bottom side:" + bottomSide
                + ", height:" + height + "units, color: " + color);
    }
}
