package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double findArea() {
        if (getArea() == 0.0) {
            return (firstSide + secondSide) / height;
        } else {
            System.out.println("The Area has already been calculated");
            return getArea();
        }
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + findArea()
                + " sq.units, " + "height: " + height
                + " units, color: " + getColor();
    }
}
