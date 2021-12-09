package mate;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (sideA + sideB) / 2 * height;
    }

    @Override
    public String draw() {
        return "isoscelesTrapezoid, "
                +
                "area = " + getArea()
                +
                " sq.units, sideA = " + sideA
                +
                " units, sideB = " + sideB
                +
                " units, height = " + height
                +
                " units, color = '" + getColor() + '\''
                +
                '}';
    }
}


