package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int leg;
    
    public IsoscelesTrapezoid(String colour, int bottomSide, int topSide, int leg) {
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.leg = leg;
        
        setColour(colour);
        setArea(areaCalculator());
    }
    
    public int getBottomSide() {
        return bottomSide;
    }
    
    public int getTopSide() {
        return topSide;
    }
    
    public int getLeg() {
        return leg;
    }
    
    @Override
    public double areaCalculator() {
        double legSquare = Math.pow(leg,2);
        double sidesDiffPerTwoInSquare = Math.pow(((bottomSide - topSide) / 2), 2);
        double height = Math.sqrt(legSquare - sidesDiffPerTwoInSquare);
        
        return (bottomSide + topSide) / 2 * height;
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Isosceles Trapezoid, area: " + decimalFormat.format(getArea())
                + " sq. units, bottom side: " + getBottomSide()
                + " units, top side: " + getTopSide()
                + " units, leg side: " + getLeg()
                + " units, color: " + getColour());
    }
}
