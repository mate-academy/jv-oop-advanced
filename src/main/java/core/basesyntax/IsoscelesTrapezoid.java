package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 4) * Math.sqrt(4 * Math.pow(sideC,2) - Math.pow(sideA - sideB,2));
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side A: " + sideA
                + " units, side B: " + sideB
                + " units, side C: " + sideC + " units");
    }
}
