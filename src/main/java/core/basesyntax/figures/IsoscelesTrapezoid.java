package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomSide;
    private final int topSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * (bottomSide + topSide) / 2; //the formula of trapezoid area
    }

    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "bottom side: " + bottomSide + " units, "
                + "top side: " + topSide + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
