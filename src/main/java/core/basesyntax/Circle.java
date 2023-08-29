package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super();
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("We have the figure circle with radius " + radius + " , with the area "
                    + Math.PI * radius * radius + "and color " + color);
    }
}


