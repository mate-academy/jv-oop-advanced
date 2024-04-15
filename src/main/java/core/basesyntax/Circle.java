package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
        area();
    }

    @Override
    public int area() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Figure: circle, "
                +"area: " + area() + " units"
                +", radius: " + area() + " sq. units"
                +", color: " + getColor();
    }
}
