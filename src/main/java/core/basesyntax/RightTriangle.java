package core.basesyntax;

public class RightTriangle extends Figure implements GettingArea {
    private double heightSize;
    private double baseSize;

    public RightTriangle(String color, double baseSize, double heightSize) {
        super(color);
        this.baseSize = baseSize;
        this.heightSize = heightSize;
    }

    @Override
    public double getArea() {
        return  baseSize * heightSize / 2;
    }
    @Override
    public String toString() {
        return "Figure: Right Triangle, " + "Color: " + this.getColor() + ", Base Size: " + baseSize
                + ", Height Size: " + heightSize + ", Area: " + this.getArea();
    }
}
