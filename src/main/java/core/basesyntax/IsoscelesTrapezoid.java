package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private double downSide;
    private double upSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double downSide, double upSide, double height) {
        super(color);
        this.downSide = downSide;
        this.upSide = upSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (downSide + upSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area %s, downSide %s, upSide %s,"
                + " height %s, color %s.%n", calculateArea(), downSide, upSide, height, getColor());
    }
}
