package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        setName(name);
        setColor(color);
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
        double hypotenuse = Math.hypot(sideA, sideB);
        return Math.round(hypotenuse * 100.0) / 100.0;
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
