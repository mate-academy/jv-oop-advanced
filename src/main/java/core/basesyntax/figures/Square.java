package core.basesyntax.figures;

public class Square extends Rectangle {
    private final static String NAME = "square";
    public Square(String color, int sizeOfEverySide) {
        super(color, sizeOfEverySide, sizeOfEverySide);
    }

    @Override
    public String toString() {
        return "Figure: " + NAME + ", area: " + super.getArea() + " sq.units,"
                + " side: " + super.sizeOfTopSide + ", color: " + getColor();
    }
}
