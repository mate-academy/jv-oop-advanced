package core.basesyntax;

public class RightTriangle extends Figure {

    private final double height;
    private final double arm;

    public RightTriangle(String color, double height, double arm) {
        super(color);
        this.height = height;
        this.arm = arm;
    }

    @Override
    public double GetArea() {
        return height * arm / 2;
    }

    @Override
    public void GetPrint() {
        System.out.println("Figura: Trójkąt " + "Pole: " + (height * arm / 2) + " Kolor: " + getColor());
    }
}
