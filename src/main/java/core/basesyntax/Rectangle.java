package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator{
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: " + width +
                " units, height: " + height + " units, color: " + new ColorSupplier().getRandomColor().toLowerCase());
    }
}
