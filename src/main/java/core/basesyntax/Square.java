package core.basesyntax;

public class Square extends Figure implements Shape {
    private int sideA;

    public Square(int sideA, String color) {
        super(color);
        this.sideA = sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return Math.round(sideA * sideA);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side length: "
                + sideA + " units, color: " + getColor());
    }

}
