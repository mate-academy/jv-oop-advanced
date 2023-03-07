package core.basesyntax;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle(String color, double legA, double legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    public double getLegA() {
        return legA;
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public double getLegB() {
        return legB;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

   @Override
   public double area() {
       return (legA * legB) / 2;
   }

   @Override
   public void print() {
       System.out.println("Figure RightTriangle, area: " + area() + "LegA: " + legA
               + "LegB: " + legB + "Color: " + getColor());

   }
}
