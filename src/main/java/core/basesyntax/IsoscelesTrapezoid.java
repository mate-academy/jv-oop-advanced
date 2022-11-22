package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private String color;
    private float top;
    private float bottom;
    private float height;

    public IsoscelesTrapezoid(String color, float top, float bottom, float height) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public float getTop() {
        return top;
    }

    public float getBottom() {
        return bottom;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public float area() {
        return (getBottom() + getTop()) / 2 * getHeight();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " circle with top equals to "
                + getTop()
                + " bottom equals to "
                + getBottom()
                + " and height equals to "
                + getHeight()
                + " area equals "
                + area());
    }
}
