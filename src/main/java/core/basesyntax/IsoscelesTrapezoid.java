package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase * lowerBase) * height;
    }

    @Override
    public String getPrint() {
        return null;
    }
}
