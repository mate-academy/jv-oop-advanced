package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String output = "Figure: circle" + System.lineSeparator()
                + "Color: " + color + System.lineSeparator()
                + "Area: " + roundDouble(calcArea()) + " sq. units" + System.lineSeparator()
                + "Radius: " + roundDouble(radius) + " units";

        System.out.println(output);
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
