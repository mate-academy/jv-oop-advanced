package core.basesyntax;

public class Square extends Figure {
    private int said;

    public Square(String color,int said) {
        super(color);
        this.said = said;
    }

    @Override
    public int getArea() {
        return said * said;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + said + " units, color: " + getColor());
    }
}
