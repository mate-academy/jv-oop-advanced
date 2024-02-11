package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getPrint() {
        return "Figure:  isosceles trapezoid, area: " + getArea() + "sq. units, "
                + " a: " + firstSide + " units, "
                + " b: " + secondSide + " units, " + " h: "
                + height + " units, " + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
