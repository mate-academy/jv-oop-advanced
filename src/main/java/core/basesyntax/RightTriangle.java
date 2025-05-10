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
    public void drawFigure() {
        System.out.println("RightTriangle: "
                + "baseOfTriangle = " + baseOfTriangle
                + ", heightOfTriangle = " + heightOfTriangle
                + ", color = " + getColor()
                + ", area = " + calculateArea() + '.');
    }

    @Override
    public double calculateArea() {
        return 0.5 * baseOfTriangle * heightOfTriangle;
    }
}
