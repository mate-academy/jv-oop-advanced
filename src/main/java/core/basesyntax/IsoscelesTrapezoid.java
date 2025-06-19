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
    public double ObtainArea() {
        return (top + bottom) * height / 2;
    }

    @Override
    public void DrawArea() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + ObtainArea() + " sq. units, height: "
                + height + " units, bottom: " + bottom + " units, top: " + top + " units, color: " + color);
    }
}
