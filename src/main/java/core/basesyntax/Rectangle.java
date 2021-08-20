package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sides: "
                + firstSide + " and " + secondSide + " units, color: " + color);
    }
}
