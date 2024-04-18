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
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + area + "sq. units, upperBase: "
                + upperBase + "units, lowerBase: " + lowerBase + "units, height: " + height);
    }
}
