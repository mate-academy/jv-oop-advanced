package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.width = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double areaInfo() {
        return length * width;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: rectangle, area: "
                + areaInfo() + " sq.units, length: "
                + getLength() + " units, width: "
                + getWidth() + " units, color: "
                + getColor());
    }
}
