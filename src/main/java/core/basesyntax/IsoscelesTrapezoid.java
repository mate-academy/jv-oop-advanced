package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int high;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
