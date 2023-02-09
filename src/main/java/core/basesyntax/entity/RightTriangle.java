package core.basesyntax.entity;

public class RightTriangle extends Figure implements FigureBehaviour {
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
    public void printSquare() {

    }
}
