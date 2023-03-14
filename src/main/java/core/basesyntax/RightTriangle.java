package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int adjacent;
    private int opposite;
    private double hypotenuse;
    
    public RightTriangle(String colour, int adjacent, int opposite) {
        this.adjacent = adjacent;
        this.opposite = opposite;
        
        setHypotenuse(Math.sqrt((adjacent * adjacent) + (opposite * opposite)));
        setColour(colour);
    }
    
    public int getAdjacent() {
        return adjacent;
    }
    
    public int getOpposite() {
        return opposite;
    }
    
    public double getHypotenuse() {
        return hypotenuse;
    }
    
    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
    
    @Override
    public double areaCalculator() {
        return adjacent * opposite / 2;
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Right Triangle, area: " + decimalFormat.format(getArea())
                + " sq. units, adjacent: " + getAdjacent()
                + " units, opposite: " + getOpposite()
                + " units, hypotenuse: " + getHypotenuse()
                + " units, color: " + getColour());
    }
}
