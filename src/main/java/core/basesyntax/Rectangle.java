package core.basesyntax;

public class Rectangle implements Figure{
    private int height;
    private int said;
    private String color;
    public Rectangle(int height, int said, String color) {
        this.height = height;
        this.said = said;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * said * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + "sq. units, side: "
                + said + "units, height: " + height + "units, color: " + color);
    }
}
