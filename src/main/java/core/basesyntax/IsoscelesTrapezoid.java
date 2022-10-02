package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int equalSides;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int equalSides, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.equalSides = equalSides;
        this.color = color;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getEqualSides() {
        return equalSides;
    }

    public String getColor() {
        return color;
    }

    //A = 1/2 h(a+b)
    @Override
    public double area() {
        double height = Math.pow((Math.pow(equalSides, 2) -
                Math.pow((bottomSide - topSide) / 2, 2)), 0.5);
        return 0.5 * height * (bottomSide + topSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " +
                "area: " + area() + " sq.units, " +
                "bottom side: " + getBottomSide() + " units, " +
                "top side: " + getTopSide() + " units, " +
                "equal sides: " + getEqualSides() + " units, " +
                "color: " + getColor());
    }
}
