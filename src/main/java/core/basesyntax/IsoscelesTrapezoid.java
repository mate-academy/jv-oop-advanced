package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int upSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upSide, int bottomSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.upSide = upSide;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, bottomSide: "
                + bottomSide
                + " units, upSide: "
                + upSide
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * bottomSide * upSide * height;
    }
}
