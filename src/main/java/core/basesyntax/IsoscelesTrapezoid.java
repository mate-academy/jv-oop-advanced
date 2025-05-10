package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int equalSides;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int equalSides, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.equalSides = equalSides;
    }

    @Override
    public double getArea() {
        double height = Math.pow((Math.pow(equalSides, 2)
                - Math.pow((bottomSide - topSide) / 2, 2)), 0.5);
        return 0.5 * height * (bottomSide + topSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "bottom side: " + bottomSide + " units, "
                + "top side: " + topSide + " units, "
                + "equal sides: " + equalSides + " units, "
                + "color: " + color
        );
    }
}
