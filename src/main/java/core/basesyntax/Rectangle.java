package core.basesyntax;

public class Rectangle extends Figure implements Draw, ObtainArea {
    private String color;
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB : " + sideB + " units, color: " + color);

    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
