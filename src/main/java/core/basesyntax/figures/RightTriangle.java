package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double height;
    private double side;

    public RightTriangle(String color, double height, double side) {
        super(color);
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
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
