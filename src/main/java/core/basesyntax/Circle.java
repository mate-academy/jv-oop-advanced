package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String countArea() {
        return String.format("%.1f",(float) (Math.PI * radius * radius));
    }

    public void draw() {
        System.out.println("Circle, area: " + countArea() + " sq.units, radius: "
                           + radius + " units, color: " + getColor());
    }
}
