package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.floor(width * height);
    }

    public void toDraw() {
        System.out.println("rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height
                + " units, color: " + getColor());
    }
}
