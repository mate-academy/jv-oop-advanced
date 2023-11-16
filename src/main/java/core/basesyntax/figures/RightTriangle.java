package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String name, double base, double height, String color) {
        this.setName(name);
        this.base = base;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return base * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units,"
                + " base: " + base + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }
}
