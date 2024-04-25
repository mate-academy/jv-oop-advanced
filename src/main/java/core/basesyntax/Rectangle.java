package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int said;

    public Rectangle(String color,int height,int said) {
        super(color);
        this.height = height;
        this.said = said;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * said * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, side: "
                + said + " units, height: " + height + " units, color: " + getColor());
    }
}
