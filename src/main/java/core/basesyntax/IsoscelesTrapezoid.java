package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideH;

    public IsoscelesTrapezoid(int sideA, int sideB, int sideH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public void draw() {
        System.out.println("Draw trapezoid");
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2 * sideH;
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }

    @Override
    public int getHeight() {
        return sideH;
    }
}
