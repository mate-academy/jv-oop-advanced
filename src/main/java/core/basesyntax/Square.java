package core.basesyntax;

public class Square extends Figure {
    private double side;
    
    public Square(double side, Color color) {
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
        setColor(color);
    }
    
    public double getDiagonal() {
        return Math.sqrt(side * side * 2);
    }
    
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
    
    @Override
    public String getParameters() {
        return String.format("Rectangle, side: %f units, area: %f sq. units, "
                        + "perimeter: %f units, diagonal: %f units, color: %s",
                side, getArea(), getPerimeter(), getDiagonal(), getColor());
    }
}
