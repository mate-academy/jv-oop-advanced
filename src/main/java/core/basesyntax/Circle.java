package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int raduis) {
        super(color);
        this.radius = raduis;
    }

    @Override
    public void draw() {
        System.out.println("Circle{"
                + "color= "
                + getColor()
                + " raduis="
                + radius
                + " area="
                + this.getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }
}
