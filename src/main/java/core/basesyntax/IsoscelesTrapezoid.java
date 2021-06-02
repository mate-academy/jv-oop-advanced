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
    double figureArea() {
        return (downSide + upSide) / 2 * height;
    }

    @Override
    void drawFigure() {
        System.out.println(String.format("Figure: isosceles trapezoid, area %s, downSide %s, " +
                "upSide %s, height %s, color %s.", figureArea(), downSide, upSide, height, color));
    }
}
