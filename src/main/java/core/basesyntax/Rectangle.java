package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private int sideA;
    private int sideB;

    public Rectangle(String color) {
        this.setColor(color);
    }

    public Rectangle(String color, int sideA, int sideB) {
        this.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq.units, sideA: " + this.getSideA() + " units, sideB: "
                + this.getSideB() + " units, color: " + this.getColor());
    }
}
