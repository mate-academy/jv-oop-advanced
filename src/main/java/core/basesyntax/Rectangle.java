package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("rectangle, area: " + this.getArea() + " sq.units, side A: "
                + this.sideA + " units, side B: " + this.sideB + " units, color: "
                + super.getColor());
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }
}
