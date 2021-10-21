package core.basesyntax.figures;

public class Triangle extends Figure {
    private String name;
    private int radius;

    public Triangle(String color, String name, int radius) {
        super(color);
        this.name = name;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + name
                + ", with color " + getColor()
                + ", and " + getArea() + " radius");
    }

    @Override
    public double getArea() {
        return radius * radius;
    }
}
