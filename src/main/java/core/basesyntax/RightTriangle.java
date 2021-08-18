package core.basesyntax;

public class RightTriangle extends Figure {
    private int baseOfTriangle;
    private int heightOfTriangle;

    public RightTriangle(int baseOfTriangle, int heightOfTriangle, Color color) {
        super(color);
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    @Override
    public String toString() {
        return "RightTriangle: "
                + "baseOfTriangle = " + baseOfTriangle
                + ", heightOfTriangle = " + heightOfTriangle
                + ',' + super.toString();
    }

    @Override
    public double areaCalculator() {
        return 0.5 * baseOfTriangle * heightOfTriangle;
    }
}
