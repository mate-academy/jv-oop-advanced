package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq. units, sides length: " + sideA + ", " + sideB
                + " color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
