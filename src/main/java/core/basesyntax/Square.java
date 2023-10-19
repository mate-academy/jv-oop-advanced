package core.basesyntax;

public class Square extends Figure {
    private final int sideLength;

    public Square(String color, int sideLength) {
        this.setColor(color);
        this.sideLength = sideLength;
    }

    @Override
    public void obtainTheArea() {
        setArea(Math.pow(sideLength, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + sideLength + " units, color: " + getColor().toLowerCase());
    }
}
