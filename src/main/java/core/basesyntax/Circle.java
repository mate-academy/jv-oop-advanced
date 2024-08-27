package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Figure createRandomFigure() {
        return new Circle(getRandomInt());
    }

    @Override
    public void printInformation() {
        System.out.println("Circle radius: " + radius
                + " area: " + (Math.PI * Math.pow(radius, 2))
                + " Color " + getColor());
    }
}
