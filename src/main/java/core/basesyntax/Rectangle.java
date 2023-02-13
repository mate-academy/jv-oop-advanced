package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.width = sideA;
        this.length = sideB;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle "
                + ", area: "
                + calculateArea() + " sq.units, width: "
                + width + " units, length: "
                + length + " units, color: "
                + getColor().name());
    }
}
