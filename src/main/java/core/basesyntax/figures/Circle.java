package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        getArea();
    }

    @Override
    public void getArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + area + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color);
    }
}
