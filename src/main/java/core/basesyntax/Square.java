package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int a) {
        super(color);
        this.side = a;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + obtainArea()
                + " sq. units, side: " + side
                + " units, color: " + super.getColor());
    }

    @Override
    public int obtainArea() {
        return (int) Math.pow(side, 2);
    }
}
