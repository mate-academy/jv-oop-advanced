package core.basesyntax.entity;

public class RightTriangle extends Figure implements Printer {
    public static final double MAX_LEFT_LEG = 100;
    public static final double MAX_RIGHT_LEG = 100;
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
        System.out.println(new StringBuilder().append(" IsoscelesTrapezoid, area: ")
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
