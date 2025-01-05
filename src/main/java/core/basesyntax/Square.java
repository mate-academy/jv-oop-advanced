package core.basesyntax;

public class Square extends Figure {
    private final double sideLength;
    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }
    @Override
    public void draw() {
        System.out.println("Square: color = " + getColor() + ", sideLength = " + sideLength);
    }

}
