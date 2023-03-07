package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        double area = calcArea();
        String colorString = color.toString();

        System.out.printf("Figure: rectangle, area: %,.2f sq.units, side a: %d units, "
                + "side b: %d units, color: %s%n",
                        area, sideA, sideB, colorString);
    }
}
