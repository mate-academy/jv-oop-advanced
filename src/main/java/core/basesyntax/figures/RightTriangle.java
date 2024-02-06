package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double height;
    private double side;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " area: " + this.calculateArea() + " hight "
                + getHeight() + " side " + getSide() + ", color: "
                + getColor());
    }

    @Override
    public double calculateArea() {
        return (height * side) / 2;
    }
}
