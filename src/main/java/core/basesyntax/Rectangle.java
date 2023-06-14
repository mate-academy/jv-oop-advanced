package core.basesyntax;

public class Rectangle extends Figure {
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = Color.valueOf(color);
    }

    public Rectangle(float sideA, float sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public float getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has two sides of "
                + sideA
                + " two sides of "
                + sideB
                + " and the area of "
                + getArea());
    }
}
