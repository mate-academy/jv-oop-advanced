package core.basesyntax.figures;

public class Rectangle  extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double obtainArea() {
        return sideA * sideB;
    }
    
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtainArea()
                + " sq.units, side a: " + sideA
                + " units, side b: " + sideB
                + " units, color: " + getColor());
    }
}
