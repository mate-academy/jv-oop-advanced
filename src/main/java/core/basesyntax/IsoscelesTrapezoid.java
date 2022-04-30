package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(int height, int top, int bottom, String color) {
        this.height = height;
        this.top = top;
        this.bottom = bottom;
        super.setColor(color);
    }

    @Override
    public double getFigureArea() {
        return height * (top + bottom) / 2;
    }

    public String getFigureInfo() {
        return "isosceles trapezoid, area: " + getFigureArea()
            + " sq.units, height: " + height + " units, top: " + top + " units, bottom: "
            + bottom + " units, color: " + super.getColor();
    }
}
