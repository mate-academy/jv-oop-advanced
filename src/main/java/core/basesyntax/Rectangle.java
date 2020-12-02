package core.basesyntax;

public class Rectangle extends Figure implements Draw {

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
    public void unicMetod() {
        System.out.println("Metod rectangle");
    }
}
