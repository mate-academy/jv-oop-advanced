package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureInterface {

    public int height, sideA, sideB;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return ((double) height * (sideA + sideB)) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() +
                " sq.units, sideA: " + sideA + " units, sideB: " + sideB +
                " units, height: " + height + " color: " + color);
    }
}
