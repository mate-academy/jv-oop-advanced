package core.basesyntax;

public class RightTriangle extends Figure {
    private double side1;
    private double height;
    
    public RightTriangle(String color, double side1, double height) {
        super(color);
        this.side1 = side1;
        this.height = height;
    }
    
    public double getSide1() {
        return side1;
    }
    
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * side1 * height;
    }
    
    @Override
    public void draw() {
        System.out.println(" Figure: right triangle,  area: " + getArea() + " sq.units, side: "
                + side1 + " " + height + " units, color: " + getColor());
    }
}
