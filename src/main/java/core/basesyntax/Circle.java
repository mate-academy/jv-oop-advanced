package core.basesyntax;

public class Circle extends Figure implements FigureOperations {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.setType("circle");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea()
                + " units, radius: " + radius + " units, color: " + getColor());
    }
}
