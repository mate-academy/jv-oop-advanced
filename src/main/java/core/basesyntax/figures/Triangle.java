package core.basesyntax.figures;

public class Triangle extends Figure {
    private int radius;
    private int leftLeg;
    private int rightLeg;

    public Triangle(String color, int radius, int leftLeg, int rightLeg) {
        super(color);
        this.radius = radius;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName()
                + ", with color " + getColor()
                + ", and " + getArea() + " radius"
                + " leftLeg " + leftLeg
                + " rightLeg " + rightLeg);
    }

    @Override
    public double getArea() {
        return radius * radius;
    }
}
