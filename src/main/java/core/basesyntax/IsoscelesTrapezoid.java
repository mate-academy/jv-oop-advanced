package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(double downSide, double height, String color) {
        this.downSide = downSide;
        this.height = height;
        super.color = color;
    }

    @Override
    public double getArea() {
        return downSide * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: " + this.getArea() + "Down sides: "
                + this.downSide + "; Height" + this.height + " color:" + super.color);
    }
}
