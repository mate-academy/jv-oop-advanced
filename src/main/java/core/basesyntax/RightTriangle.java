package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;
    
    public RightTriangle(String color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * side * height;
    }
    
    @Override
    public void draw() {
        System.out.println(" Figure: right triangle,  area: " + getArea() + " sq.units, side: "
                + side + " height " + height + " units, color: " + getColor());
    }
}
