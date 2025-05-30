package core.basesyntax;

public class Square extends AbstractFigure {

    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square,  area: " + (side * side)
                + " sq. units side: " + side + " units, color: " + color);
    }
}
