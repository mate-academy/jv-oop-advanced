package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return Math.ceil(sideA * sideB * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rectangle"
                + ", area: " + calculateArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, color: " + getColor());
    }

}
