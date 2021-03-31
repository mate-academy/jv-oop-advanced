package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String figureProperty, String color, int length, int width) {
        super(figureProperty, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getFigureProperty() + ", area: " + getArea()
                + " square units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
