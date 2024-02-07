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
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle "
                + ", area: "
                + calculateArea() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
