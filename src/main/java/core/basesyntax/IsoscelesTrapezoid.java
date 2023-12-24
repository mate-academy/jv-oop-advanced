package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int top;
    private final int bottom;

    public IsoscelesTrapezoid(String color, int height, int top, int bottom) {
        this.name = "isosceles trapezoid";
        this.color = color;
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + name + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "height: " + height + UNITS
                + "top: " + top + UNITS
                + "bottom: " + bottom + UNITS
                + "color: " + color;
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return ((double) (top + bottom) / 2) * height;
    }
}
