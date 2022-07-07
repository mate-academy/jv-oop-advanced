package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toDraw() {
        return "Figure: rectangle, area: " + getArea()
                + " units, width: " + getWidth()
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }
}
