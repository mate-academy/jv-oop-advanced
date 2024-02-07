package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
        this.width = width;
        this.length = length;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: reactangle"
                + ", area: "
                + calculateArea()
                + " sq.units"
                + ", width: "
                + width
                + " units, length: "
                + length
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
