package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = random.nextInt(Max_Value);
        this.sideB = random.nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
