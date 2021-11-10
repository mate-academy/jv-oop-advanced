package core.basesyntax.figure;

public class Trapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public Trapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        super.setFigureColor(color);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setHeight(int height) {
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
    public double getArea() {
        return ((sideA + sideB) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid. Area: " + getArea()
                + " sq.units. SideA: " + getSideA()
                + " units. SideB: " + getSideB()
                + " units. Height: " + getHeight()
                + " units. Color: " + getFigureColor() + "\n");
    }
}
