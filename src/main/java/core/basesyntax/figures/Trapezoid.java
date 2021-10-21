package core.basesyntax.figures;

public class Trapezoid extends Figure {
    private String name;
    private int radius;

    public Trapezoid(String color, String name, int radius) {
        super(color);
        this.name = name;
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Figure " + name
                + ", with color " + getColor()
                + ", and " + radius + " radius");
    }

    @Override
    public boolean getArea() {
        return false;
    }
}
