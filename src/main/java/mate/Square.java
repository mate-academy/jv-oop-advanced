package mate;

public class Square extends Figure {
    private final int sideA;

    public Square(String color, int sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return (sideA * sideA);
    }

    @Override
    public String draw() {
        return "square, "
                + "area = " + getArea()
                + " sq.units, sideA = " + sideA
                + " units, color = '" + getColor() + '\''
                + '}';
    }
}


