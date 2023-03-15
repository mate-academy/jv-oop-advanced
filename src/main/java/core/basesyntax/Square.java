package core.basesyntax;

import java.text.DecimalFormat;

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
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        System.out.println("Figure: Square, area: " + decimalFormat.format(getArea())
                + " sq. units, side: " + side
                + " units, color: " + getColour());
    }
}
