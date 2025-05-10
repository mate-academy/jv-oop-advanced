package core.basesyntax;

public class RightTriangle extends Figure {
    private int adjacent;
    private int opposite;
    private double hypotenuse;
    
    public RightTriangle(String colour, int adjacent, int opposite) {
        super(colour);
        this.adjacent = adjacent;
        this.opposite = opposite;
        
        hypotenuse = (Math.sqrt((adjacent * adjacent) + (opposite * opposite)));
    }
    
    @Override
    public double calculateArea() {
        return adjacent * opposite / 2;
    }
    
    @Override
    public void draw() {
        System.out.println(String.format("Figure: Right Triangle, area: %.2f sq.units, "
                        + "sq. units, adjacent: %d units, "
                        + "opposite: %d units, "
                        + "hypotenuse: %d units, "
                        + "colour: %s",
                calculateArea(), adjacent, opposite, hypotenuse, getColour()));
    }
}
