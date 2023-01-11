package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int basisOne;
    private final int basisTwo;
    private final int width;

    public IsoscelesTrapezoid(int basisOne, int basisTwo, int width, String color) {
        this.basisOne = basisOne;
        this.basisTwo = basisTwo;
        this.width = width;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) ((basisOne + basisTwo) / 2) * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, color: "
                + getColor().toLowerCase() + ", area: "
                + String.format("%.2f", getArea()) + " sq.units,"
                + " basisOne: " + basisOne + " units,"
                + " basisTwo: " + basisTwo + " units,"
                + " width: " + width + " units");
    }
}
