package core.basesyntax.entity;

public class RightTriangle extends Figure {
    public static final int MAX_LEFT_LEG = 100;
    public static final int MAX_RIGHT_LEG = 100;

    public static final double DEFAULT_LEFT_LEG = 50;
    public static final double DEFAULT_RIGHT_LEG = 50;
    private double leftLeg;
    private double rightLeg;

    public RightTriangle(Color color, double leftLeg, double rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        this.leftLeg = leftLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" RightTriangle, area: ")
                .append(leftLeg * rightLeg / 2)
                .append(" sq.units,")
                .append(" firstSide: ")
                .append(leftLeg)
                .append(" units")
                .append(" secondSide: ")
                .append(rightLeg)
                .append(" units, color: ")
                .append(getColor()));
    }
}
