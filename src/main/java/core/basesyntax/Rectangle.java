package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + Math.round(getArea()) + " sq. units, height: "
                + Math.round(getHeight()) + " units, color: "
                + getColor();
    }
}
