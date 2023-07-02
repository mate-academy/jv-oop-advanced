package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + ", area: " + getFigureArea());
    }
}

