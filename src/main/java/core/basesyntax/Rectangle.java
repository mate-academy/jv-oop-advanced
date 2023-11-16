package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD, String color) {
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
        int length = Math.min(getSideA(), getSideB());
        int width = Math.max(getSideA(), getSideB());
        return length * width;
    }

    @Override
    public String draw() {
        return "isosceles trapezoid, side A: " + getSideA() + " units, side B: " + getSideB()
                + " units, side C: " + getSideC() + " units, side D: " + getSideD()
                + " units, color: " + getColor() + ", area: " + area() + " sq.";
    }
}
