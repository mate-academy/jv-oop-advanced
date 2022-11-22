package core.basesyntax;

public class Rectangle extends Shape {
    private String color;
    private float height;
    private float width;

    public Rectangle(String color, float height, float width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    @Override
    public float area() {
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
                + area());
    }
}
