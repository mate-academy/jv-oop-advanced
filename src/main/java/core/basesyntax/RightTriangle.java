package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;

    public RightTriangle(int sideA, String color) {
        this.sideA = sideA;
        this.setColor(color);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rightTriangle, area: " + area()
                + " sq.units, three same sides: " + getSideA()
                + " units, color: " + getColor());

    }

    @Override
    public double area() {
        return (Math.sqrt(3) * (sideA * sideA)) / 4;
    }
}
