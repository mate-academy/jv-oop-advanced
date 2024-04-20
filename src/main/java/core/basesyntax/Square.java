package core.basesyntax;

public class Square implements Figure{
    private int said;
    private String color;
    public Square(int said, String color) {
        this.said = said;
        this.color = color;
    }

    @Override
    public double getArea() {
        return said * said;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + "sq. units, side: "
                + said + "units, color: " + color);
    }
}
