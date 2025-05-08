package core.basesyntax;

public class Rectangle extends Figures {
    private int sideFirst;
    private int sideSecond;

    public int getSideFirst() {
        return sideFirst;
    }

    public void setSideFirst(int sideFirst) {
        this.sideFirst = sideFirst;
    }

    public int getSideSecond() {
        return sideSecond;
    }

    public void setSideSecond(int sideSecond) {
        this.sideSecond = sideSecond;
    }

    @Override
    double getArea() {
        return sideFirst * sideSecond;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea() + " sq. units, sideFirst: "
                + sideFirst + "units, sideSecond: "
                + sideSecond + " units, color: "
                + getColor());
    }
}
