package core.basesyntax;

public class Rectangle extends Figures {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: width "
                + width + " height "
                + height + " color: " + getColor() + " area: " + getArea());
    }
}
