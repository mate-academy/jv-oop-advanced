package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public RightTriangle(int sideA, int sideB, int sideC, String color) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
        setColor(color);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public int area() {
        return (int) (0.5 * getSideA() * getSideB());
    }

    @Override
    public String draw() {
        return "rightTriangle, side A: " + getSideA() + " units, side B: " + getSideB()
                + " units, side C: " + getSideC()
                + " units, color: " + getColor() + ", area: " + area() + " sq.";
    }
}
