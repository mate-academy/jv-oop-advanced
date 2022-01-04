package core.basesyntax;

public class Rectangle extends Figure {

    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        super.setType("rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + ", area: " + this.getArea()
                + " sq.units, sideA: " + this.sideA + " units, sideB: " + this.sideB
                + " units, color: " + super.getColor());
    }
}
