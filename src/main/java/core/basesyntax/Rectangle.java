package core.basesyntax;

public abstract class Rectangle extends Figure {
    private int width;
    private int height;
    private final Color color;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return ("Figure: Rectangle, area: " + getArea() + "sq. units," + "widthg: " + width
                + "units," + "height: " + height + "units, " + "color: " + color);
    }
}

