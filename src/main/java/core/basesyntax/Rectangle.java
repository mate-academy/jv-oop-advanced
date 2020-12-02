package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public int getSide() {
        return sideA;
    }
}
