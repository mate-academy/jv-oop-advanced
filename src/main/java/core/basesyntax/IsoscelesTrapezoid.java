package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Shape {
    private int height;
    private int sideA;
    private int sideB;

    public IsoscelesTrapezoid(int height, int sideA, int sideB, String color) {
        super(color);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setParameters(int height, int sideA, int sideB) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return Math.round((height / 2.0) * (sideA + sideB));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, side height: " + height + " units, color: " + getColor());
    }
}
