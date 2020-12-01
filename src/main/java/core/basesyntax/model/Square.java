package core.basesyntax.model;

public class Square extends Rectangle {
    private final int diagonalLength;

    public Square(int sideLength, Color color) {
        super(sideLength, sideLength, color);
        this.diagonalLength = (int) Math.round(sideLength * Math.sqrt(2));
        this.area = Math.pow(sideLength, 2);
    }

    @Override
    public String draw() {
        return new StringBuilder("Square: ")
                .append("area = ")
                .append(this.area)
                .append(", side length = ")
                .append(this.getSideLength())
                .append(" diagonal length = ")
                .append(diagonalLength)
                .append(", color = ")
                .append(this.color)
                .toString();
    }

    public int getDiagonalLength() {
        return diagonalLength;
    }
}
