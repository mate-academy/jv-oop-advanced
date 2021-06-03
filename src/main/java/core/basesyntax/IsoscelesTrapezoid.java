package core.basesyntax;



public class IsoscelesTrapezoid extends Figure {
    private double upBase;
    private double downBase;
    private double leftBase;
    private double rightBase;

    public IsoscelesTrapezoid(String color, double upBase, double downBase, double leftBase, double rightBase){
        this.upBase = upBase;
        this.downBase = downBase;
        this.leftBase = leftBase;
        this.rightBase = rightBase;
        setColor(color);
        areaCalculate();
    }



    public void areaCalculate() {

        setArea((upBase + downBase) * ((upBase + downBase) / 2) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure:  isosceles trapezoid, area: " + getArea()
                + " sq.units, upBase: " + upBase
                + " units, downBase: " + downBase
                + " units, rightBase: " + rightBase
                + " units, leftBase: " + leftBase
                + " units, color: " + getColor());
    }
}
