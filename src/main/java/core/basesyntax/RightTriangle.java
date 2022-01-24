package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }
    
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
    
    public void draw() {
        System.out.println("Figure - right triangle, color - " + getColor()
                + ", area - " + getArea()
                + ", first leg - " + firstLeg
                + ", second leg - " + secondLeg);
    }
}
