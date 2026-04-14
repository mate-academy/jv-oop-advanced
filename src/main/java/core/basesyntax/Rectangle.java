package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color, FigureType.RECTANGLE);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase()
                + ", area: " + calculateArea() + "\" sq. units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "color: " + getColor());
    }
}
