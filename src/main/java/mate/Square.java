package mate;

public class Square extends Figure {
    private final int sideA;
    private final String color;

    public Square(String color, int sideA) {
        super();
        this.color = color;
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return (sideA * sideA);
    }

    @Override
    public String draw() {
        return "square, "
                +
                "area = " + getArea()
                +
                " sq.units, sideA = " + sideA
                +
                " units, color = '" + color + '\''
                +
                '}';
    }
}


