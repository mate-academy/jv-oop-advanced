package core.basesyntax;

public class Rectangle implements Area, Draw {
    private int sideA;
    private int sideB;
    private String color;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void getRectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        draw();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, "
                + "sideA: " + getSideA()
                + ", sideB: " + getSideB() + " units, color: " + color);
    }
}
