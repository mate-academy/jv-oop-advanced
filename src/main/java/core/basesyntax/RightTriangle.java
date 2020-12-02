package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    
    public RightTriangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setArea(sideA * sideB / 2);
        setPerimeter(sideA + sideB + getHypotenuse());
        setColor(color);
    }
    
    @Override
    public void draw() {
        System.out.printf("Right triangle, sideA: %f units, sideB: %f units, hypotenuse: %f units, "
                        + "area: %f sq. units, perimeter: %f units, color: %s%n",
                sideA, sideB, getHypotenuse(), getArea(), getPerimeter(), getColor());
    }
    
    public double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
