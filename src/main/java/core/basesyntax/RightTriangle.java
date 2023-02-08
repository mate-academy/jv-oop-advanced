package core.basesyntax;

public class RightTriangle extends Figure {
    public static final int MAX_LEFT_LEG;
    public static final int MAX_RIGHT_LEG;

    static {
        MAX_LEFT_LEG = 100;
        MAX_RIGHT_LEG = 100;
    }

    private int leftLeg;
    private int rightLeg;

    public RightTriangle(Color color, int leftLeg, int rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public int calculateArea() {
        return (leftLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("\nRightTriangle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("left leg:" + leftLeg + "\nright leg:" + rightLeg + "\n");
    }
}
