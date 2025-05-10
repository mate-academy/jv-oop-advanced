package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public IsoscelesTrapezoid(int sideA, int sideB, int sideC, int sideD, String color) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
        setSideD(sideD);
        setColor(color);
    }

    // Геттеры
    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideD() {
        return sideD;
    }

    // Сеттеры
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    @Override
    public int area() {
        int base1 = Math.min(getSideA(), getSideB());
        int base2 = Math.max(getSideA(), getSideB());
        int height = getSideC();
        return (int) (0.5 * (base1 + base2) * height);
    }

    @Override
    public String draw() {
        return "isosceles trapezoid, side A: " + getSideA() + " units, side B: " + getSideB()
                + " units, side C: " + getSideC() + " units, side D: " + getSideD()
                + " units, color: " + getColor() + ", area: " + area() + " sq.";
    }
}
