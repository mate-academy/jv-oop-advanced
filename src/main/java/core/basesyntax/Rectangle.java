package core.basesyntax;

public class Rectangle extends Figure {
    private int sizeA;
    private int sizeB;

    public Rectangle(int sizeA, int sizeB, String color) {
        super(color);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public double getArea() {
        return sizeA * sizeB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "First size " + sizeA + " units, "
                + "Second size " + sizeB + " units, "
                + "color: " + getColor());
    }
}
