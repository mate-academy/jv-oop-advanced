package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private String color;

    public Circle(int radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " radius: " + radius + " ,color: " + color;
    }
}

