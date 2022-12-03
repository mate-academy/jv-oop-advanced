package core.basesyntax;

public class Rectangle extends Figure {
    private float height;
    private float width;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, float height, float width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return getHeight() * getWidth();
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " rectangle  with height equals to "
                + getHeight()
                + " and width equals to "
                + getWidth()
                + " area equals "
                + getArea());
    }
}
