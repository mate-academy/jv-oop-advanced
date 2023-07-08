package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        //this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: прямокутник, площа: " + getArea() + " , сторона1: " + sideA
                + " , сторона2: " + sideB + " , колір: " + color);
    }
}
