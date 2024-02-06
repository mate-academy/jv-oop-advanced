package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperSide;
    private final int downSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int upperSide, int downSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return (upperSide + downSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper side: " + upperSide
                + " units, down side: " + downSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
