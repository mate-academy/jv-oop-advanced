package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private int side;
    
    public Square(String colour, int side) {
        this.side = side;
        
        setArea(areaCalculator());
        setColour(colour);
    }
    
    public int getSide() {
        return side;
    }
    
    @Override
    public double areaCalculator() {
        return side * side;
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        System.out.println("Figure: Square, area: " + decimalFormat.format(getArea())
                + " sq. units, side: " + getSide()
                + " units, color: " + getColour());
    }
}
