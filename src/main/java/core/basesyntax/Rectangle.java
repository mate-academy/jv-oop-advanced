package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int length;

    public Rectangle(String color, int height, int length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public double obtainArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure, rectangle, area: " + obtainArea()
                + " sq.units, height: " + height
                + " units, length: " + length
                + " units, color: " + getColor());
    }
}
