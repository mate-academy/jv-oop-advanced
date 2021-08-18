package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color) {
        super(name, color);
        this.radius = (int)(Math.random() * 100);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drow() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "radius: " + radius + " units, " + "color: " + getColor();
    }
}
