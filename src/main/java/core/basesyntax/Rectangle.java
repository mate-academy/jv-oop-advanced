package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    
    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setArea(sideA * sideB);
        setPerimeter((sideA + sideB) * 2);
        setColor(color);
    }
    
    @Override
    public void draw() {
        System.out.printf("Rectangle, sideA: %f units, sideB: %f units, area: %f sq. units, "
                        + "perimeter: %f units, diagonal: %f units, color: %s%n",
                sideA, sideB, getArea(), getPerimeter(), getDiagonal(), getColor());
    }
    
    public double getDiagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
    
    public double getSideA() {
        return sideA;
    }
    
    public double getSideB() {
        return sideB;
    }
}
