package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void area() {
        double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the rightCircle is " + areaCircle +
                " and colo " + getColor());
    }
}
