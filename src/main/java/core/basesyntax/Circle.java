package core.basesyntax;

public class Circle extends Figure implements Drawable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle\nColor : " + getColor() + "\nRadius: " + radius);
    }
}
