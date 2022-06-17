package core.basesyntax;

public class Rectangle extends Figure {
    private ColorSupplier cs = new ColorSupplier();
    private double width;
    private double height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = cs.getRandomColor();
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
                + ", color: " + color);
    }
}
