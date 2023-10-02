package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Circle(double area, String color, double radius) {
        super(area, color);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    public Circle createRandomCircle() {
        return new Circle(countArea(), colorSupplier.getRandomColor(), random.nextInt(10));
    }

    @Override
    public void draw() {
        if (radius == 10 && Color.WHITE.name().equals(Color.WHITE.name())) {
            System.out.println("Figure: circle, area: " + countArea()
                    + " sq.units, radius: " + radius
                    + " units, color: " + Color.WHITE.name());
        } else {
            Circle randomCircle = createRandomCircle();
            System.out.println("Figure: circle, area: " + randomCircle.countArea()
                    + " sq.units, radius: " + randomCircle.getRadius()
                    + " units, color: " + colorSupplier.getRandomColor());
        }
    }
}
