package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.type = getClass().getSimpleName();
        this.height = height;
        this.width = width;
        this.color = ColorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", height: " + height + ", width: " + width + ", color: " + color);
    }
}
