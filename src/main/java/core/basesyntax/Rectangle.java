package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
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
