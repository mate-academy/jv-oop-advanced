package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int width;
    private int height;
    
    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.height = height;
        this.width = width;
        
        setArea(calculateArea());
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Rectangle, area: " + decimalFormat.format(getArea())
                + " sq. units, height: " + height
                + " units, height: " + width
                + " units, color: " + getColour());
    }
}
