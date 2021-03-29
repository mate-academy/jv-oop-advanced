package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getHypotenuse() {
        return Math.hypot(sideA, sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", Area: " + getArea()
                + " sq. units, hypotenuse: " + getHypotenuse()
                + " units, color: " + getColor());
    }
}
