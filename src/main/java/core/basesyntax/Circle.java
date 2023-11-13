package core.basesyntax;

/**
 * Клас Circle представляє коло.
 */

public class Circle extends Figure {
    private int radius;

<<<<<<< HEAD
    /**
     * Конструктор Circle.
     * @param radius радіус кола
     */

=======
>>>>>>> a0b1bb2 (remove encoding config from checkstyle plugin)
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());

    }

}
