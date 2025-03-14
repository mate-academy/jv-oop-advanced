package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    private int side;
    private final static String NAME = "Square";


    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double printArea() {
        double area = (double) side * side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + printArea() + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
