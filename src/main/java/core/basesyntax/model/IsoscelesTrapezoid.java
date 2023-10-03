package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int hight;
    private int bottomParallel;
    private int topParallel;

    public IsoscelesTrapezoid(String color, int hight, int topParallel, int bottomParallel) {
        super(color);
        this.hight = hight;
        this.topParallel = topParallel;
        this.bottomParallel = bottomParallel;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public double getTopParallel() {
        return topParallel;
    }

    public void setTopParallel(int topParallel) {
        this.topParallel = topParallel;
    }

    public int getBottomParallel() {
        return bottomParallel;
    }

    public void setBottomParallel(int bottomParallel) {
        this.bottomParallel = bottomParallel;
    }

    @Override
    public double getArea() {
        return (bottomParallel + topParallel) / 2.0 * hight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, hight: "
                + getHight() + " units, topParallel: " + getTopParallel()
                + " units bottomParallel: " + getTopParallel()
                + " units color: " + getColor());
    }
}
