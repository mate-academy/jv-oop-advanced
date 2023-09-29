package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom1;
    private int bottom2;
    private int height;

    public IsoscelesTrapezoid(Color color, int bottom1, int bottom2, int height) {
        super(color);
        this.bottom1 = bottom1;
        this.bottom2 = bottom2;
        this.height = height;
    }

    public int getBottom1() {
        return bottom1;
    }

    public int getBottom2() {
        return bottom2;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return (double) (getBottom1() + getBottom2()) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.println(("Figure: isoscelesTrapezoid, area: " + findArea()
                + " sq.units, bottom 1: " + getBottom1() + " sq.units, bottom 2: "
                + getBottom2() + " sq.units, height: " + getHeight()
                + " units, color: " + getColor()));

    }
}
