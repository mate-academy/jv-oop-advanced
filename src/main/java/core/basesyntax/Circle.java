package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    public Circle(String name, String color,int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor() + ".");
    }

    @Override
    public double getArea() {
        return Math.round((Math.PI * radius * radius) * 100.0) / 100.0;
    }
}
