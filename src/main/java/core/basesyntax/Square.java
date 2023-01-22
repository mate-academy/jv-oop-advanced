package core.basesyntax;

public class Square extends Figure {

    private int squareSide;

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
    public void draw() {
        System.out.println("Figure: Square, " + " area, " + getArea() + " sq.units, "
                + " square.side, " + getSquareSide() + " units, " + " color: " + color);
    }

}


