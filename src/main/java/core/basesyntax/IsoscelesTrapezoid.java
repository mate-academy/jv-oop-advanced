package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int biggerBase;
    private int shorterBase;
    private int height;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public void drow() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + getColor()
                + ", bigger base: " + biggerBase + ", shorter base: " + shorterBase
                + ", area: " + getArea());
    }

    @Override
    public void areaObtain() {
        setArea((double) ((biggerBase + shorterBase) * height) / 2);
    }
}
