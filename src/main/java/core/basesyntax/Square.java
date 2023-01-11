package core.basesyntax;

public class Square extends Figure implements Drawing {
    private double sideSize;

    public Square(String color, double sideSize) {
        super(color);
        this.sideSize = sideSize;
    }
    @Override
    public double getArea() {
        return sideSize * sideSize;
    }
    @Override
    public String toString() {
        return "Figure: Square, " + "Color: " + this.getColor() + ", Side Size: " + sideSize
                + ", Area: " + this.getArea();
    }
}
