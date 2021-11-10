package core.basesyntax.figure;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;

    public Triangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setFigureColor(color);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle. Area: " + getArea()
                + " sq.units. SideA: " + getSideA()
                + " units. SideB: " + getSideB()
                + " units. Color: " + getFigureColor() + "\n");
    }
}
