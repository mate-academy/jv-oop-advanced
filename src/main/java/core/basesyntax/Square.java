package core.basesyntax;

public class Square extends Figure{
    private int squareSide;
    public Square (String color, int squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    public int getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public void drawable() {
        System.out.println("This figure is Square with area " + getArea() + " square units" + " and properties: " +
                getSquareSide());
    }
}
