package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateFigureArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInformation() {
        System.out.println("Circle radius: " + radius
                + " area: " + calculateFigureArea() + " Color " + getColor());
    }
}
