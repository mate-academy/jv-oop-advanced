package core.basesyntax;

public class Square extends Figure implements Drawing {
    private double side;

    public Square(String color) {
        super(color);
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
        area = side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq.units," +
                " side: " + side + " units," +
                " color: " + color);
    }
}
