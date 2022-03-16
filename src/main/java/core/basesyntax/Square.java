package core.basesyntax;

public class Square extends Figure {
    private int sideA;

    public Square(int sideA, String color) {
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
        System.out.println(" Figure: isoscelesTrapezoid, area: " + area()
                + " sq.units, side: " + getSideA()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return sideA * sideA;
    }
}
