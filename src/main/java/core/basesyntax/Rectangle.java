package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: units, area: " + getArea() +
                " sq. units, width: " + width + " sq. units, height: "
                + height + " units, color: " + ColorSupplier.getRandomColor());
    }
}
