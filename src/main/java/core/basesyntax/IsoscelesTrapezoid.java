package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSideA;
    private int baseSideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseSideA,int baseSideB, int height) {
        super(color);
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.height = height;
    }

    @Override
    public double areaFigure() {
        return 0.5 * (baseSideA + baseSideB) * height;
    }

    public double middleLine() {
        return areaFigure() / height;
    }

    @Override
    public String drawn() {
        return "Figure: isosceles trapezoid , area: " + areaFigure() + " sq. units, middle line: "
                + middleLine() + " units, color: " + getColor();
    }
}
