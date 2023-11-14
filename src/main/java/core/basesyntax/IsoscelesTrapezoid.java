package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable{

    private final double longerBase;
    private final double shorterBase;
    private final double leg;

    public IsoscelesTrapezoid(Color color, double longerBase, double shorterBase, double leg) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.leg = leg;
    }

    public double getLongerBase() {
        return longerBase;
    }

    public double getShorterBase() {
        return shorterBase;
    }

    public double getLeg() {
        return leg;
    }

    public double getArea() {
        return round(((longerBase + shorterBase) * getHeight()) / 2);
    }

    public double getHeight() {

        return round((Math.sqrt(4 * Math.pow(leg,2) - Math.pow(longerBase - shorterBase, 2))) / 2);
    }

    public double getPerimeter() {

        return round(longerBase + shorterBase + 2 * leg);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid" +
                        ", longer base: " + longerBase + " units" +
                        ", shorter base: " + shorterBase + " units"+
                        ", leg: " + leg + " units"+
                        ", height: " + getHeight() +" units"+
                        ", area: " + getArea() +" sq. units"+
                        ", perimeter: " + getPerimeter() +" units"+
                        ", color: " + color
        );
    }
}
