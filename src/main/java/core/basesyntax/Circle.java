package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void draw() {
        //musiałem zmienić przez ciągły błąd przy clean install characters (found 105). [LineLength]
        String figureDetails = "Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor();
        System.out.println(figureDetails);
    }
}
