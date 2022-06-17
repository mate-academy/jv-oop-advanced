package core.basesyntax;

public class Rectangle extends Shape {
    private ColorSupplier cs = new ColorSupplier();
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: rectangle, area: " + (width * height)
                + ", width: " + width + ", height: " + height
                + ", color: " + getColor());
    }
}
