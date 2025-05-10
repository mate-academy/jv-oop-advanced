package core.basesyntax;

public abstract class Figure implements InterfaceArea, InterfacePaint {
    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
