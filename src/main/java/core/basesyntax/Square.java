package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;

    Square(String color,double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public String toString() {
        return "Square: "
                + "firstLeg = " + firstLeg
                + ", color = " + getColor()
                + ", area = " + calculateArea();
    }
}
