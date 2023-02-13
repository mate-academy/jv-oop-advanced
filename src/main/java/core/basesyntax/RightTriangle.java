package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        calculateArea();
    }

    public RightTriangle() {
        super(FigureType.RIGHT_TRIANGLE.name());
    }

    @Override
    public void calculateArea() {
        setArea((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, "
                + "color: " + getColor()
        );
    }
}
