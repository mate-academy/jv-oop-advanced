package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(){
    }

    public Rectangle(int firstSide, int secondSide,String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
        setArea(obtainArea());
    }

    @Override
    public double obtainArea() {
        return firstSide * secondSide;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: " + getColor());
    }
}
