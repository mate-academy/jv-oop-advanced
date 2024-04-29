package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square() {
        this.side = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq. units, " + "side: " + side + " units, color: " + getColor());
    }
}
