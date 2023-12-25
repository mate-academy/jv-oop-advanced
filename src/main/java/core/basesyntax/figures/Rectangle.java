package core.basesyntax.figures;

public class Rectangle extends Shape {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + calculateArea() + " sq. units,"
                + " sideA: " + sideA + " units,"
                + " sideB: " + sideB + " units,"
                + " color: " + color + "\"");
    }
}

