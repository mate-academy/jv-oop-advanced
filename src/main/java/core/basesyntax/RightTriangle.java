package core.basesyntax;

public class RightTriangle extends Figure {
    
    private double firstLeg;
    private double secondLeg;
    
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }
    
    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + calculateArea()
                + " sq. units, firstLegs: " + firstLeg + " units, secondLegs: " + secondLeg
                + " units, color: " + getColor());
    }
}
