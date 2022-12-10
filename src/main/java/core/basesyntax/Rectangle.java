package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public String drawTheFigure() {
        return "Figure : rectangle, area: " + calculateArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + color.toLowerCase();
    }
}
