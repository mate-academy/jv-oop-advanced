package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upperSide, int downSide, int height) {
        this.color = color;
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, color: " + getColor() + ", area: "
                + getArea() + " sq. units, height: " + height + " units, upper side: "
                + upperSide + " units, down side: " + downSide + " units");
    }
}
