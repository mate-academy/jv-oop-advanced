package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "radius: " + getRadius()
                + ", " + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public void generateRandomParameters() {
        radius = random.nextDouble() * 20;
        name = "Circle";
        color = colorSupplier.getRandomColor();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
