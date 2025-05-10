package core.basesyntax;

public class Square extends Figure {
    private int side;
    
    public Square(String color, int side) {
        super(color);
        this.side = side;
    }
    
    public double getCountSquare() {
        return side * side;
    }
    
    public void draw() {
        String squarePrint = "Figure: square, area: " + getCountSquare() + " sq.units, side: "
                + side + " units, color: " + getColor();
        System.out.println(squarePrint);
    }
}
