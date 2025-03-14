package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    private int side;

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
        String firstPart = "Figure: square, area: " + printArea();
        String secondPart = " sq. units, side: " + side + " units, color: " + getColor();
        System.out.println(firstPart + secondPart);
    }
}
