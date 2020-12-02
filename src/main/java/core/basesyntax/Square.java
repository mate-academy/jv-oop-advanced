package core.basesyntax;

public class Square extends Rectangle {

    Square(double side, Color color) {
        super(side, side, color);
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units, "
                + "side length: " + getHeight() + " units, color: "
                + getColor();
    }
}
