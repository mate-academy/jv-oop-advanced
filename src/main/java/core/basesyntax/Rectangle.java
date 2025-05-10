package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
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

    @Override
    public Double getArea() {
        return (double) sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.format("Figure: rectangle, area: %f, sideA: %d, sideB: %d, color: %s",
                getArea(), getSideA(), getSideB(), getColor());
    }
}
