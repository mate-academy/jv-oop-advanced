package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public void draw() {
        System.out.println( "rectangle, " +
               "area: " + getArea() + " sq. units, " +
               "width: " + width + " units, " +
               "height: " + height + " units, " +
               "color: " + getColor());
    }
    @Override
    public double getArea() {
        return width * height;
    }
}
