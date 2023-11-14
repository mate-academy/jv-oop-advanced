package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * ((bottomBase + topBase) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color
                + " isosceles trapezoid with bottom base " + bottomBase
                + ", top base " + topBase
                + ", height " + height
                + " and area " + calculateArea());
    }
}
