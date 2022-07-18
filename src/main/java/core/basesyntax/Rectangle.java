package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    protected Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, side A: " + sideA + ", side B: " + sideB + ", color: " + getColor());
    }
}
