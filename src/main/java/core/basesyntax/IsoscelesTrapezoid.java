package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int leg;
    
    public IsoscelesTrapezoid(String colour, int bottomSide, int topSide, int leg) {
        super(colour);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.leg = leg;
        
        setArea(calculateArea());
    }
    
    @Override
    public double calculateArea() {
        double legSquare = Math.pow(leg,2);
        double sidesDiffPerTwoInSquare = Math.pow(((bottomSide - topSide) / 2), 2);
        double height = Math.sqrt(legSquare - sidesDiffPerTwoInSquare);
        
        return (bottomSide + topSide) / 2 * height;
    }
    
    @Override
    public void draw() {
        System.out.println(String.format("Figure: Isosceles Trapezoid, "
                        + "area: %.2f sq.units, "
                        + "bottom side: %d units, "
                        + "top side: %d units, "
                        + "leg side: %d units, "
                        + "colour: %s",
                calculateArea(), bottomSide, topSide, leg, getColour()));

    }
}
