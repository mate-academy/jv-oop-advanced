package core.basesyntax;

public class Rectangle implements Figure{
    private int height;
    private int said;
    public Rectangle(int height, int said) {
        this.height = height;
        this.said = said;
    }
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area + "sq. units, side: "
                + said + "units, height: " + height + "units, color: " + color);
    }
}
