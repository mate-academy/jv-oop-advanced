package core.basesyntax.model;

public class Square extends Rectangle {
    private final int diagonalLength;

    public Square(int sideLength, Color color) {
        super(sideLength, sideLength, color);
        this.diagonalLength = (int) Math.round(sideLength * Math.sqrt(2));
    }

    @Override
    public String draw() {
        return new StringBuilder("Square: ")
                .append("area = ")
                .append(this.getArea())
                .append(", side length = ")
                .append(this.getSideLength())
                .append(", diagonal length = ")
                .append(diagonalLength)
                .append(", color = ")
                .append(this.getColor())
                .toString();
    }

    public int getDiagonalLength() {
        return diagonalLength;
    }
}
