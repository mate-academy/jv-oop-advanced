package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Draw {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(int sideA, int sideB, int sideC, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return Math.floor(((sideA + sideB) / 2) * (Math.sqrt((sideC * sideC)
                - ((sideA - sideB) * (sideA - sideB)) / 4)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + "area: " + getArea() + ", side A: "
                + sideA + ", side B: " + sideB + ", side C: " + sideC + ", color: "
                + getColor());
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "sideA=" + sideA
                + ", sideB=" + sideB
                + ", sideC=" + sideC
                + '}';
    }
}

