package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(Colors color, int sideA, int sideB, int height) {
        super(0.5 * (sideA * sideB) * height, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void drawingFigures() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "height length: " + height + " units, "
                + "sideA length: " + sideA + " units, "
                + "sideB length: " + sideB + " units, "
                + "color = " + getColor());
    }
}


