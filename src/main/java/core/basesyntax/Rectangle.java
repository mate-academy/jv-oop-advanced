package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int getHeight, int getWidth, String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + width + " units"
                + "color: " + this.color);
    }
}
