package core.basesyntax;

public class RightTriangle extends Figure {
    private final int height;
    private final int hypotenuse;

    public RightTriangle(String color, int height, int hypotenuse) {
        this.height = height;
        this.hypotenuse = hypotenuse;
        setColor(Colors.valueOf(color));
    }

    @Override
    public double getArea() {
        return (hypotenuse * height) / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, height: " + height
                + " units, hypotenuse: " + hypotenuse
                + " units, color: " + getColor().name().toLowerCase());
    }
}
