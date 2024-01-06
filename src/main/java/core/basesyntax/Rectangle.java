package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtainArea()
                + " sq. units, length: " + sideA
                + " units, width: " + sideB
                + " units, color: " + super.getColor());
    }

    @Override
    public int obtainArea() {
        return sideA * sideB;
    }
}
