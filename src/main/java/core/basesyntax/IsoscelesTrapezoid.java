package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float top;
    private float bottom;
    private float height;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public IsoscelesTrapezoid(String color, float top, float bottom, float height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
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
    public float getArea() {
        return (getBottom() + getTop()) / 2 * getHeight();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " isosceles trapezoid with top equals to "
                + getTop()
                + " bottom equals to "
                + getBottom()
                + " and height equals to "
                + getHeight()
                + " area equals "
                + getArea());
    }
}
