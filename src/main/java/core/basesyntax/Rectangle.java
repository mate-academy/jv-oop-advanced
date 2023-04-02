package core.basesyntax;

public class Rectangle extends Figure {
    private double sizeLongSide;

    private double sizeShortSide;

    public Rectangle(String color, double sizeLongSide, double sizeShortSide) {
        super(color);
        this.sizeLongSide = sizeLongSide;
        this.sizeShortSide = sizeShortSide;
    }

    @Override
    public double calculateArea() {
        return sizeLongSide * sizeShortSide;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: rectangle, color: " + super.getColor()
                + ", size of the long side: " + sizeLongSide
                + ", size of the short side: " + sizeShortSide + ", area: " + calculateArea());
    }
}
