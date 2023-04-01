package core.basesyntax;

public class Rectangle extends Figure implements ShapeAreaCalculator, ShapePropertyDisplay {
    private double sizeLongSide;

    private double sizeShortSide;

    public Rectangle(String color, double sizeLongSide, double sizeShortSide) {
        this.color = color;
        this.sizeLongSide = sizeLongSide;
        this.sizeShortSide = sizeShortSide;
    }

    @Override
    public double calculateArea() {
        return sizeLongSide * sizeShortSide;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: rectangle, color is " + color + ", size of the long side is " + sizeLongSide
                + ", size of the short side " + sizeShortSide + ", area: " + calculateArea());
    }
}
