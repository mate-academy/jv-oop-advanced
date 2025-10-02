package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "isosceles trapezoid";
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.sideA = baseA;
        this.sideB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = ((sideA + sideB) / 2.0) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + " sq. units, side A: " + sideA
                + " units, side B: " + sideB + " units, height: "
                + height + " units, color: " + getColor());
    }
}
