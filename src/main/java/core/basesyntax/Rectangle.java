package core.basesyntax;

public class Rectangle extends Figure {
    public static final int MAX_SIDE_A;
    public static final int MAX_SIDE_B;

    static {
        MAX_SIDE_A = 100;
        MAX_SIDE_B = 100;
    }

    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("\nRectangle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("sideA:" + sideA + "\nsideB:" + sideB + "\n");
    }
}
