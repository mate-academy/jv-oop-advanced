package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        String name = getClass().getSimpleName();
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: " + name + ", area: " + area + " eq. units, color: " + color);
    }
}
