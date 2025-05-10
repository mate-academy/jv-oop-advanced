package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int top;
    private int bottom;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int top, int bottom, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.top = top;
        this.bottom = bottom;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    @Override
    public double getArea() {
        if (getFirstLeg() != getSecondLeg() && getTop() < getBottom()) {
            System.out.println("This is not isosceles ");
            return 0;
        }
        double height = Math.sqrt(Math.pow(bottom, 2) - Math.pow(top, 2));
        double result = ((top + bottom) / 2) * height;
        return result;

    }

    @Override
    public void draw() {
        System.out.println(" Figure: isosceles trapezoid, area: " + getArea()
                + "sq. units, first leg : " + getFirstLeg() + ", second leg : " + getSecondLeg()
                + "units, top leg : " + getTop() + " units, bottom leg: "
                + getBottom() + " color: " + getColor());

    }
}
