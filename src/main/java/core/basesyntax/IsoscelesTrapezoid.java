package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int downSide;
    private int isoscelesSide;

    public IsoscelesTrapezoid(String color, int topSide, int downSide, int isoscelesSide) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.isoscelesSide = isoscelesSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getDownSide() {
        return downSide;
    }

    public int getIsoscelesSide() {
        return isoscelesSide;
    }

    @Override
    public double getArea() {
        double res;
        res = 0.5 * (topSide + downSide)
                * Math.sqrt(isoscelesSide - 0.25 * Math.pow((topSide - downSide), 2));
        return res;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top side: " + getTopSide()
                + " units, down side: " + getDownSide()
                + " isosceles side:  " + getIsoscelesSide()
                + " units, color: " + getColor());
    }
}
