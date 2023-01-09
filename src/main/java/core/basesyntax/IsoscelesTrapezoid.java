package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int smallBase;
    private int bigBase;
    private int height;

    public IsoscelesTrapezoid(int smallBase, int bigBase, int height) {
        this.smallBase = smallBase;
        this.bigBase = bigBase;
        this.height = height;
    }

    public int getSmallBase() {
        return smallBase;
    }

    public void setSmallBase(int smallBase) {
        this.smallBase = smallBase;
    }

    public int getBigBase() {
        return bigBase;
    }

    public void setBigBase(int bigBase) {
        this.bigBase = bigBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (smallBase + bigBase) / (double) height;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: isosceles trapezoid, area: ")
                        .append(getArea())
                        .append(" sq.units, smallBase: ")
                        .append(smallBase)
                        .append(" units, bigBase: ")
                        .append(bigBase)
                        .append("units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
