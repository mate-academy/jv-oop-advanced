package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int heigthOfTrapezoid;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int heigthOfTrapezoid) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.heigthOfTrapezoid = heigthOfTrapezoid;
    }

    @Override
    public double getArea() {
        return ((bottomSide + topSide) / 2) * heigthOfTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area " + getArea() + " sq.units, "
                + "bottomSide " + bottomSide + " units, "
                + "topSide " + topSide + " units, "
                + "heigthOfTrapezoid " + heigthOfTrapezoid + " units, "
                + "color: " + getColor());
    }
}

