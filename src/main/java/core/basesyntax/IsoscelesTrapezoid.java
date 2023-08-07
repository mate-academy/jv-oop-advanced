package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return height/2*(sideA + sideB);
    }
}
