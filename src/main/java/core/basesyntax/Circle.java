package core.basesyntax;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(2 * Math.PI * radius, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                 + " sq. units, area: "
                 + radius + " units, color: " + color);
    }

}
