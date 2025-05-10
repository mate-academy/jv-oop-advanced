package core.basesyntax;

public class Square extends Figure {
    private int side;
    
    public Square(String colour, int side) {
        super(colour);
        this.side = side;
        setArea(calculateArea());
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
    @Override
    public void draw() {
        System.out.println(String.format("Figure: Square, area: %.2f sq.units, "
                        + "side: %d units, "
                        + "colour: %s",
                calculateArea(), side, getColour()));
    }
}
