package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: circle, radius: "
                + radius
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }
}
