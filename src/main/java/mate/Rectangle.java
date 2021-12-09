package mate;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (double) sideA * sideB;
    }

    @Override
    public String draw() {
        return "rectangle, "
                +
                ", area = " + getArea()
                +
                " sq.units, sideA = " + sideA
                +
                " units, sideB = " + sideB
                +
                " units, color = '" + getColor() + '\''
                +
                '}';
    }
}



