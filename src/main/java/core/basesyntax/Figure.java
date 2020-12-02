package core.basesyntax;

public abstract class Figure implements Drawable {
    private double area;
    private double perimeter;
    private Color color;
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
}
