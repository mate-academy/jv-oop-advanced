package core.basesyntax.figures;

public class Circle extends Figure {
    private String name;
    private int radius;

    public Circle(String name, String color, int radius) {
        super(color);
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + name
                + ", with color " + getColor()
                + ", and " + getArea() + " radius");
    }
}
