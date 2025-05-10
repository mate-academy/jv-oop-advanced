package core.basesyntax;

public class Square extends Figure {
    private final int side;
    
    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + calculateArea()
                + "sq. units, side: " + side + "sq. units, color: " + getColor());
    }
}
