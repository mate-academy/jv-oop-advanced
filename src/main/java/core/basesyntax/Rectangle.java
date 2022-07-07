package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;
    private ColorSupplier colorSupplier = new ColorSupplier();

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

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toDraw() {
        return "Figure: rectangle, area: " + getArea()
                + " units, width: " + getWidth()
                + " units, height: " + getHeight()
                + " units, color: " + colorSupplier.getRandomColor();
    }
}
