package core.basesyntax;

public class Rectangle extends Figure implements Draw, FigureArea {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDraw() {
        return "Rectangle: area: "
                + getArea()
                + " sq.units, "
                + "width: " + width
                + " units, "
                + "height: " + height
                + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
