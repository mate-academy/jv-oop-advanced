package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double a, double b) {
        super(color.toString());
        this.firstLeg = a;
        this.secondLeg = b;
    }

    @Override
    public void draw() {
        System.out.print("Figure : " + "Right Triangle ," + "Area : ");
        System.out.println(getArea() + ", Color : " + getColor());

    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
