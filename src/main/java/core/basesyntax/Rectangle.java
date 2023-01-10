package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    public int getSideA() {return sideA; }
    public void setSideA(int sideA) {this.sideA = sideA; }
    public int getSideB() {return sideB; }
    public void setSideB(int sideB) {this.sideB = sideB; }
    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
