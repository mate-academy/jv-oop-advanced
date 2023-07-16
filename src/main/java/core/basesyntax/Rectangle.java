package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private String color;

    public Rectangle(String color,int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, width: " + width
                + " units, height: " + height + " units, color: " + color);
    }
}
