package core.basesyntax;

public class IsoscelesTrapezoid extends Figure  {
    int height;
    int bottom;
    int top;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int height, int bottom, int top, String color) {
        this.height = height;
        this.bottom = bottom;
        this.top = top;
        super.color = color;
    }

    @Override
    public double obtainArea() {
        return (top + bottom) * height / 2.0;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + obtainArea() + " sq. units, height: "
                + height + " units, bottom: " + bottom + " units, top: " + top + " units, color: " + color);
    }
}
