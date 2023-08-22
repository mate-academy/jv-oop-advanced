package core.basesyntax.figures;

public class Square extends Figure {
    private static final int SQUARE_POWER = 2;
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
        super.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, SQUARE_POWER);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + side + " units");
    }
}
