package core.basesyntax;

public class RightTriangle extends Figure {
    final static String FIGURE_NAME = "Right Triangle";
    private int sideA;
    private int sideB;;

    public RightTriangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = (sideA * sideB) / 2.0;
        return area;
    }

    @Override
    public String draw() {
        return "Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, side A: " + sideA
                + " units, side B: " + sideB + " units, color: " + getColor();
    }
}
