package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private int radius;
    private String colour;

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.setColour(colour);
        // add color init
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, " + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColour());
    }
}
