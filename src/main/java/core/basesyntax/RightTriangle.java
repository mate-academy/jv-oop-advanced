package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "Right Triangle";
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
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
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + " sq. units, side A: " + sideA
                + " units, side B: " + sideB + " units, color: " + getColor());
    }
}
