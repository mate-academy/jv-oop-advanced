package core.basesyntax.figures;

public class Square extends Rectangle {
    public Square(String color, int sizeOfEverySide) {
        super(color, sizeOfEverySide, sizeOfEverySide);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + super.getArea() + " sq.units,"
                + " side: " + super.sizeOfTopSide + ", color: " + getColor();
    }
}
