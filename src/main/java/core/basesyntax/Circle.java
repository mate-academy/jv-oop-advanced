package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;
    
    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Figure: Circle, area: " + decimalFormat.format(calculateArea())
                + " sq. units, radius: " + radius
                + " units, color: " + getColour());
    }
}
