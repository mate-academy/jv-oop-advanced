package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, side a: "
                + sideA + " units, side b: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return sideB * sideA;
    }
}
