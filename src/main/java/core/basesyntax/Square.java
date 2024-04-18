package core.basesyntax;

public class Square implements Figure{
    private int said;
    public Square(int said) {
        this.said = said;
    }
    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area + "sq. units, side: "
                + said + "units, color: " + color);
    }
}
