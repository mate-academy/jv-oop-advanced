package core.basesyntax;

public class Rectangle extends Figure {
    private double horizontal;
    private double vertical;

    public Rectangle() {

    }

    public Rectangle(String color, double horizontal, double vertical) {
        setColor(color);
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public double getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }

    public double getVertical() {
        return vertical;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }

    @Override
    public void calculateArea() {
        setArea(horizontal * vertical);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, horizontal|vertical: "
                + getHorizontal() + " | " + getVertical() + ", color:" + getColor());
    }
}
