package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int biggerBase;
    private int shorterBase;
    private int height;

    public IsoscelesTrapezoid(String color, int biggerBase, int shorterBase, int height) {
        super(color);
        this.biggerBase = biggerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + getColor()
                + ", bigger base: " + biggerBase + ", shorter base: " + shorterBase
                + ", height: " + height + ", area: " + areaCalculate());
    }

    @Override
    public double areaCalculate() {
        return ((double) ((biggerBase + shorterBase) * height) / 2);
    }
}
