package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private double area;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle; Radius: " + radius
                + " units; Area: " + area
                + "sq. units; Color: "
                + super.getColor());
    }
}
