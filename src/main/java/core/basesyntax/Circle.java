package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        super.setName("circle");
        super.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units "
                + ", radius: " + radius + " units"
                + ", color: " + this.getColor());
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }
}

