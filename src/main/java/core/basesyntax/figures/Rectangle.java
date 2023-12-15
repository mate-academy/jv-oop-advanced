package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super("rectangle", color);
        this.width = width;
        this.height = height;
    }

    protected Rectangle(String name, Color color, double width, double height) {
        super(name, color);
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
    public String getInfo() {
        return super.getInfo()
                + ", width: " + round(width) + " units"
                + ", height: " + round(height) + " units";
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
