package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String colour;
    private double area;
    
    Figure (String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return colour;
    }
 
    public double getArea() {
        return area;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
}
