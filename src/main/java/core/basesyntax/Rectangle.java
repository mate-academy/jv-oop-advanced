package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw(Figure figure) {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq. units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + this.color);
    }
}
