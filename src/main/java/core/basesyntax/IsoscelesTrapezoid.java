package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bigBase;
    private int smallBase;
    private int height;

    public IsoscelesTrapezoid(int smallBase, int bigBase, int height) {
        this.smallBase = bigBase;
        this.bigBase = smallBase;
        this.height = height;
    }

    public void setSmallBase(int smallBase) {
        this.smallBase = smallBase;
    }

    public int getSmallBase() {
        return smallBase;
    }

    public void setBigBase(int bigBase) {
        this.bigBase = bigBase;
    }

    public int getBigBase() {
        return bigBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (bigBase + smallBase) / (double) height;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: IsoscelesTrapezoid, area: ")
                        .append(this.getArea())
                        .append(" sq.units, smallBase: ")
                        .append(smallBase)
                        .append(" units, bigBase: ")
                        .append(bigBase)
                        .append(" units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(this.getColor())

        );
    }
}
