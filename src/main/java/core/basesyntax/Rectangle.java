package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                            + " sq.units, first side: " + sideA + " units, second side: "
                            + sideB + " units, color: " + getColor());
    }
}
