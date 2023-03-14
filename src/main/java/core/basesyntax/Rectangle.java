package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int width;
    private int height;
    
    public Rectangle(String colour, int width, int height) {
        this.height = height;
        this.width = width;
        
        setArea(areaCalculator());
        setColour(colour);
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public double areaCalculator() {
        return width * height;
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Rectangle, area: " + decimalFormat.format(getArea())
                + " sq. units, height: " + getHeight()
                + " units, height: " + getWidth()
                + " units, color: " + getColour());
    }
}
