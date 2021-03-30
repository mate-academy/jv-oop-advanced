package core.basesyntax;

public abstract class Figure {
    public abstract double area();
    public abstract String draw();

    private Double sideA;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

}
