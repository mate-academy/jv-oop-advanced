package core.basesyntax.figures;

public class Triangle extends Figure {
    private int radius;
    private int leftLeg;
    private int rightLeg;

    public int getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public int getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

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
                + " leftLeg " + getLeftLeg()
                + " rightLeg " + getRightLeg());
    }

    @Override
    public double getArea() {
        return radius * radius;
    }
}
