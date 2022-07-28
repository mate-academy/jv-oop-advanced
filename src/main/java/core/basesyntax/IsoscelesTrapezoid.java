package core.basesyntax;

public class IsoscelesTrapezoid  extends Color{
    private String color;
    private int upperSide;
    private int downSide;
    private int elevation;

    public IsoscelesTrapezoid(int upperSide, int downSide, int elevation, String color) {
        this.color = color;
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.elevation = elevation;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) / 2) * elevation;
    }

    @Override
    public String getDraw() {
        return "This is Isosceles Trapezoid. I have Area: " + getArea() + "; upperSide: "
                + upperSide + "; downSide: "
                + downSide + "; elevation: " + elevation + "; and have color: " + getColor();
    }
}
