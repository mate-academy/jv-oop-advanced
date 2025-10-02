package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "Isosceles Trapezoid";
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = ((baseA + baseB) / 2.0) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, side A: " + baseA
                + " units, side B: " + baseB + " units, height: "
                + height + " units, color: " + getColor());
    }
}
