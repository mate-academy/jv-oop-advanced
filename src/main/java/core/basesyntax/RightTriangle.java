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
    
    public double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
    
    @Override
    public void draw() {
        System.out.println("Draw right triangle");
    }
    
    @Override
    public String getParameters() {
        return String.format("Right triangle, sideA: %f units, sideB: %f units,"
                        + "hypotenuse: %f units, area: %f sq. units, "
                        + "perimeter: %f units, color: %s",
                sideA, sideB, getHypotenuse(), getArea(), getPerimeter(), getColor());
    }
}
