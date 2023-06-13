package core.basesyntax;

public class Square extends Rectangle {

    public Square(String color, double side) {
        super(color);
        setWidth(side);
        setLength(side);
    }
}
