package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color = getColor();
    private int trSide1;
    private int trSide2;
    private int trHeight;

    public IsoscelesTrapezoid(int trSide1, int trSide2, int trHeight) {
        this.trSide1 = trSide1;
        this.trSide2 = trSide2;
        this.trHeight = trHeight;
    }

    public IsoscelesTrapezoid(String color, int trSide1, int trSide2, int trHeight) {
        this.color = color;
        this.trSide1 = trSide1;
        this.trSide2 = trSide2;
        this.trHeight = trHeight;
    }

    @Override
    public double getArea() {
        return ((trSide1 + trSide2) / 2 * trHeight);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, parallel side 1: " + trSide1 + " units, parallel side 2: "
                + trSide2 + ", color: " + getColor());
    }

}
