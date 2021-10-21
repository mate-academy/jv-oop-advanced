package core.basesyntax;

public class Rectangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public Rectangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
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
        return getLeftLeg() * getRightLeg();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: rectangle, area: ").append(area())
                .append(" sq.units, leftLeg: ").append(getLeftLeg()).append(" units, rightLeg: ")
                .append(getRightLeg()).append(" units, color: ").append(getColor().toLowerCase()));
    }
}
