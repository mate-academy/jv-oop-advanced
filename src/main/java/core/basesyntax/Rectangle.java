package core.basesyntax;

public class Rectangle extends Figure{

    private int sideA;
    private int sideB;
    private int sideC;

    public Rectangle(Color color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
        super.draw();
    }
}
