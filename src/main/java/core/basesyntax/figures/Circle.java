package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea() + " radius: "
                + this.radius + " units, color: " + this.getColor());
    }

}
