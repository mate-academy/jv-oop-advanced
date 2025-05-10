package core.basesyntax;

public class Rectange extends Figure {
    private int sideA;
    private int sideB;

    public Rectange(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, color: " + getColor());
    }
}
