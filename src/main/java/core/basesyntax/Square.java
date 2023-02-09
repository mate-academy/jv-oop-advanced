package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, ColorSupplier cs) {
        super(cs);
        this.side = side;
        calcSquare();
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", square) + " sq.units, side: "
                + String.format("%.2f", side) + " units, color: " + color);
    }
	
    private void calcSquare() {
        this.square = this.side * this.side;
    }
}
