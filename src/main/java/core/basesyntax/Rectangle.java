package core.basesyntax;

public class Rectangle extends Figure implements FigureInterface {

        public int sideA, sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
        public double calculateArea() {
            return sideA * sideB;
        }

    @Override
    public void drawInfo() {
        System.out.println("Figure: rectangle, area: " + calculateArea() +
                " sq.units, sideA: " + sideA + " units, sideB: " + sideB + " units, color: " + color);
    }
}
