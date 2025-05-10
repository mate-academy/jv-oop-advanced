package core.basesyntax;

public class RightTriangle extends Figure {
    private final int height;
    private final int hypotenuse;

    public RightTriangle(Color color, int height, int hypotenuse) {
        this.height = height;
        this.hypotenuse = hypotenuse;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return (hypotenuse * height) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, height: " + height
                + " units, hypotenuse: " + hypotenuse
                + " units, color: " + getColor().name().toLowerCase());
    }
}
