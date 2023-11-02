package core.basesyntax;

public class Circle extends Figure {
    private static final int EXPONENTIATION = 2;
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, EXPONENTIATION);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle"
                + "\n"
                + "Area: "
                + getArea()
                + "\n"
                + "Radius: "
                + radius
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}
