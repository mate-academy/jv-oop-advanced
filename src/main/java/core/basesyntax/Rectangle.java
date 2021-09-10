package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private int sideB;
    private String color;

    public Rectangle(int sideA,int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (sideA * sideB);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + color;
    }
}
