package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    
    private double base1;
    private double base2;
    private double trapHeight;
    
    public IsoscelesTrapezoid(String color, double base1, double base2, double trapHeight) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.trapHeight = trapHeight;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * trapHeight;
    }
    
    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + calculateArea()
                + " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
                + trapHeight
                + " units, color: " + getColor());
    }
}
