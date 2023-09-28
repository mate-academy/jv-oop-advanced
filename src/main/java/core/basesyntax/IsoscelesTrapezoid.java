package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) ((sideA + sideB) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "first side: " + sideA + " units, "
                + "second side: " + sideB + " units, "
                + "color: " + this.getColor()
        );
    }
}
