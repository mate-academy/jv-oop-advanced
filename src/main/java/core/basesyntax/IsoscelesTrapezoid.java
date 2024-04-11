package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "Square"
                + ","
                + " area: "
                + getArea()
                + " sq. units,"
                + " firstSide: "
                + firstSide
                + " secondSide: "
                + secondSide
                + " height: "
                + height
                + " units,"
                + " color: "
                + getColor());
    }
}
