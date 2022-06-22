package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawing {
    private double firstBase;
    private double secondBase;
    private double height;
    private static final double K = 0.5;

    public IsoscelesTrapezoid(String color){
        super(color);
    }

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        area = (firstBase + secondBase) * K  * height;
    }

    public void draw() {
        System.out.println("Figure: trapezoid, area: " + area + " sq.units," +
                " height: " + height + " units," +
                " firstBase: " + firstBase + " units," +
                " secondBase: " + secondBase + " units," +
                " color: " + color);
    }
}
