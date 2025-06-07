package core.basesyntax;

public class Square extends Figure {
    
    private double side;
    
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    
    @Override
    public double getCalculateArea() {
        return side * side;
    }
    
    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getCalculateArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
