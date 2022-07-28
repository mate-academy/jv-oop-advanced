package core.basesyntax;

public class Square extends Rectangle {

    public Square(double side, String color) {
        super(side, side, color);
    }

    public void display() {
        System.out.println("Figure: square," + " area: "
                + calculateArea() + " sq.units," + " side: "
                + getHeight() + " units," + " color: " + getColor());
    }
}
