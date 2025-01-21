package core.basesyntax.figure;

public class RightTriangle extends Figure {

    private final double height;
    private final double arm;

    public RightTriangle(String color, double height, double arm) {
        super(color);
        this.height = height;
        this.arm = arm;
    }

    @Override
    public double getArea() {
        return height * arm / 2;
    }

    @Override
    public void print() {
        System.out.println("Figura: Trójkąt " + "Pole: " + (height * arm / 2)
                + " Kolor: " + getColor());
    }
}
