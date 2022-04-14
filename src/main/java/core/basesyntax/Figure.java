package core.basesyntax;

public abstract class Figure {
    private String color;
    private double square;

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void printSquareInfo();
}
