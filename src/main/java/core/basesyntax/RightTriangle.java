package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

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

    @Override
    public double area() {
        return leftLeg * rightLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: rightTriangle, area: ")
                .append(area()).append(" sq.units, leftLeg: ").append(getLeftLeg())
                .append(" units, rightLeg: ").append(getRightLeg()).append(" units, color: ")
                .append(getColor().toLowerCase()));
    }
}
