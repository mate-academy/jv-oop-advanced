package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String colour, double upperSide, double downSide, double height) {
        super(colour);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper side: " + upperSide + " units, down side: "
                + downSide + " units, height: " + height + " units, colour: " + getColour());
    }
}
