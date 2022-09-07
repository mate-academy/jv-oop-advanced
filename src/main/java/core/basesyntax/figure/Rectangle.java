package core.basesyntax.figure;

public class Rectangle extends Figure {
    private final double sideA;

    private final double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle{"
                + "area=" + calculateArea()
                + ", sideA=" + sideA
                + ", sideB=" + sideB
                + ", color=" + color.name()
                + '}');
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
