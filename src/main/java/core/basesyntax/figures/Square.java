package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        getArea();
    }

    @Override
    public void getArea() {
        area = Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + area
                + " sq.units, " + "side: " + side + " units, "
                + "color: " + color);
    }

}
