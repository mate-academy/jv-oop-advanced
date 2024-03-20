package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.round(length * width * 1.0);
    }

    @Override
    public void draw() {
        String result = "Figure: rectangle, area: " + this.getArea()
                + " sq. units, length: "
                + length + " units, width: "
                + width + " units, color: " + getColor().toLowerCase() + System.lineSeparator();
        System.out.printf(result);
    }
}
