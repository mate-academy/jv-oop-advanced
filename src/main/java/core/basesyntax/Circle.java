package core.basesyntax;

public class Circle extends Figure implements Drowable {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drow() {
        System.out.println("Name: " + getClass().getSimpleName()
                + " Color: " + this.getColor()
                + " Radius: " + radius + " units."
                + " Area: " + getArea() + " sq.units.");
    }
}
