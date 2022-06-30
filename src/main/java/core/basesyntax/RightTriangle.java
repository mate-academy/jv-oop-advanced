package core.basesyntax;

public class RightTriangle extends State {
    private int catet1;
    private int catet2;

    public void setCatet1(int catet1) {
        this.catet1 = catet1;
    }

    public void setCatet2(int catet2) {
        this.catet2 = catet2;
    }

    @Override
    public double getArea() {
        return (catet1 * catet2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", catet1: "
                + catet1
                + " units"
                + ", catet2: "
                + catet2
                + ", color: "
                + getColor());
    }
}
