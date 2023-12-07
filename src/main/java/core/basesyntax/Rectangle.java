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
    public Object getArea() {
        return Integer.valueOf(sideA * sideB);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle:");
    }

    @Override
    public String toString() {
        return ("Color: " + getColor() + ", Sides A-B: " + sideA + " " + sideB
                + ", Area: " + getArea());
    }
}
