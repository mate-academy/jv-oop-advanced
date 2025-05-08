package core.basesyntax;

public class RightTriangle extends Figures {
    private int sideBase;
    private int sideHeight;

    public int getSideBase() {
        return sideBase;
    }

    public void setSideBase(int sideBase) {
        this.sideBase = sideBase;
    }

    public int getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(int sideHeight) {
        this.sideHeight = sideHeight;
    }

    @Override
    double getArea() {
        return 0.5 * sideBase * sideHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: "
                + getArea() + " sq. units, sideBase: "
                + sideBase + "units, sideHeight: "
                + sideHeight + " units, color: "
                + getColor());
    }
}
