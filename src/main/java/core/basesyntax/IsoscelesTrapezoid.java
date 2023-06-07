package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int downBase;
    private int upBase;
    private int height;
    
    public IsoscelesTrapezoid(String color, int downBase, int upBase, int height) {
        super(color);
        this.downBase = downBase;
        this.upBase = upBase;
        this.height = height;
    }
    
    public double getCountSquare() {
        return ((downBase + upBase) / 2.0) * height;
    }
    
    @Override
    public void print() {
        String print = "Figure: isoscelesTrapezoid, area: " + getCountSquare() + " sq.units, "
                + "downBase: " + downBase + " units, upBase: " + upBase + " units, height: "
                + height + " units, color: " + getColor();
        System.out.println(print);
    }
}
