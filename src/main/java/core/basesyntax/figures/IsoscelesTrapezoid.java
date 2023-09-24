package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int side;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int side) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    public int getTopBase() {
        return topBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2.0 * (Math.pow(Math.pow(side, 2)
                - Math.pow(bottomBase - topBase, 2) / 4, 0.5));
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, one base: "
                + topBase + " units, second base: " + bottomBase
                + " units, side: " + side + " units, color: " + getColor());
    }
}
