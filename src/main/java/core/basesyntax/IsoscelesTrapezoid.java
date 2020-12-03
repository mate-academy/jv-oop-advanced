package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int height) {
        super(0.5 * (sideA * sideB) * height, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "height length: " + getHeight() + " units, "
                + "sideA length: " + getSideA() + " units, "
                + "sideB length: " + getSideB() + " units, "
                + "color = " + getColor());
    }
}


