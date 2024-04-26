package core.basesyntax;

public class Square implements Figure {
    private final Colors color;
    private final double side;

    public Square (Colors color, double side){
        this.color = color;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea() + " sq. units, side: " + side
                + "units, color: " + color);
    }
}
