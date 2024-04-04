package core.basesyntax;

public abstract class RightTriangle extends Figure implements Obtainable, Drawable {

    private static final String name = "RightTriangle";
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(Color color, double firstLeg, double secondLeg, double area, String name) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = area;
    }

    @Override
    public void obtain() {
        area = (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", Area: " + area
                + " Color: " + getColor());
    }
}
