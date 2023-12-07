package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public Double getArea() {
        //widening casting eliminates precision loss in the return statement?
        return 0.5 * (double) height * ((double) sideA + (double) sideB);
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid:");
    }

    @Override
    public String toString() {
        return ("Color: " + getColor() + ", Sides A-B: " + sideA + " " + sideB
                + ", Height: " + height + ", Area: " + getArea());
    }
}
