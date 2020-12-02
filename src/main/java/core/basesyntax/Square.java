package core.basesyntax;

public class Square extends Figure {
    private double side;
    
    public Square(double side, Color color) {
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
        setColor(color);
    }
    
    @Override
    public void draw() {
        System.out.printf("Rectangle, side: %f units, area: %f sq. units, perimeter: %f units,"
                        + "diagonal: %f units, color: %s%n",
                side, getArea(), getPerimeter(), getDiagonal(), getColor());
    }
    
    public double getDiagonal() {
        return Math.sqrt(side * side * 2);
    }
}
