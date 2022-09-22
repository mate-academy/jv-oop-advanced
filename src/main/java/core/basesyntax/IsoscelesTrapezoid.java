package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side1;
    private double side2;
    private double height;
    
    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }
    
    public double getSide1() {
        return side1;
    }
    
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return ((side1 + side2) / 2 * height);
    }
    
    @Override
    public String draw() {
        return " Figure: isosceles trapezoid,  area: " + getArea() + " sq.units, side1: "
                + getSide1() + " side2 " + getSide2() + " height " + getHeight()
                + " units, color: " + getColor();
    }
}
