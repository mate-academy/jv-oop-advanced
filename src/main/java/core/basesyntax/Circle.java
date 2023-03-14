package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;
    
    public Circle(String color, int radius) {
        this.radius = radius;
        
        setColour(color);
        setArea(areaCalculator());
    }
    
    public int getRadius() {
        return radius;
    }
    
    @Override
    public double areaCalculator() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Circle, area: " + decimalFormat.format(getArea())
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColour());
    }
}
