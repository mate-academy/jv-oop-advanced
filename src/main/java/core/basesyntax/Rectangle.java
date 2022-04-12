package core.basesyntax;

public class Rectangle extends Figure implements CanObtainArea, CanDraw {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, side A: "
                + getSideA() + " units, side B: " + getSideB() + " units, color: " + getColor();
    }
}
