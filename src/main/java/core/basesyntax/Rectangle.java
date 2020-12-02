package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(Colors color, int sideA, int sideB) {
        super(sideA * sideB, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, perimeter: "
                + getPerimeter() + " units, diagonal: "
                + getDiagonal() + " units, color: " + getColor());
    }

    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    public double getDiagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
