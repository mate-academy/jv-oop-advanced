package core.basesyntax;

public class Square extends Shape {
    private String color;
    private float side;

    public Square(String color, float side) {
        this.color = color;
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public float area() {
        return getSide() * getSide();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " square with side equals "
                + getSide()
                + " area equals "
                + area());
    }
}
