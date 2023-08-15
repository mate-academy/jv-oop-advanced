package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String colour, int upperSide, int downSide, int height) {
        super(colour);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double) (upperSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper side: " + upperSide + " units, down side: "
                + downSide + " units, height: " + height + " units, colour: " + getColour());
    }
}
