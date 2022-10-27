package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;


    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", volume: "
                + getVolume() + " sq.units, color: " + getColor() + ", sideA: " + getSideA()
        + ", sideB: " + getSideB());
        return null;
    }

    @Override
    public double getVolume() {
        return sideA * sideB;
    }
}
