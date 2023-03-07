package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double heightH;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double heightH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.heightH = heightH;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeightH() {
        return heightH;
    }

    public void setHeightH(double heightH) {
        this.heightH = heightH;
    }

   @Override
   public double area() {
       return (sideA+sideB)/2*heightH;
   }

   @Override
   public void print() {
       System.out.println("Figure IsoscelesTrapezoid area: " + area() + "SideA: " + sideA
               + "SideB: " + sideB + "HeghtH: " + heightH + "Color: " + getColor() );

   }
}
