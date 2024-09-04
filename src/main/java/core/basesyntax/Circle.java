package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final int index = 2;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,index);
    }

    @Override
    public void printProperties() {
        System.out.println("Figure: Circle," + " area: " + calculateArea() + " sq units, "
                            + " radius: " + radius + " unit," + " color: " + color);
    }
}
