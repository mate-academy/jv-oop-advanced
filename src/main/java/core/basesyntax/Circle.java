package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return super.toString() +
                "radius: " + radius;
    }
}
