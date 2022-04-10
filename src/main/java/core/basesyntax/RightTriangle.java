package core.basesyntax;

public class RightTriangle extends Figure implements FigureBehaviour {
    private double rightLeg;
    private double leftLeg;

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        this.rightLeg = rightLeg;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        this.leftLeg = leftLeg;
    }

    @Override
    public double calculateArea() {
        return (this.rightLeg * this.leftLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq.units, right leg: "
                + this.getRightLeg()
                + " units, left leg: "
                + this.getLeftLeg()
                + " units, color: "
                + this.getColor()
                + "\n");
    }

    @Override
    public RightTriangle setRandomParameters() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.rightLeg = Main.getRandom().nextInt(maxParameterLength);
        rightTriangle.leftLeg = Main.getRandom().nextInt(maxParameterLength);
        return rightTriangle;
    }
}
