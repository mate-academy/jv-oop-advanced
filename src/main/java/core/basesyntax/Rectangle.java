package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle:    area = %.2f sq. units, width = %.2f units, "
                        + "height = %.2f units, color = %s%n",
                this.area, this.width, this.height, this.color);
    }
}
