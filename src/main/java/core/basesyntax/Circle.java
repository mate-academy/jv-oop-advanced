package core.basesyntax;

public class Circle extends Figure {

    private final int radius;

    public Circle(int radius) {
        super();
        super.setType("circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + ", area: " + this.getArea() + " sq.units, radius: " + this.radius + " units, color: " + super.getColor());
    }
}
