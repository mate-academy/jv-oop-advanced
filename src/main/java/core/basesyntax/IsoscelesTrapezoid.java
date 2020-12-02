package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int buttonBase;
    private final int topBase;
    private final int height;

    protected IsoscelesTrapezoid(Color color, int buttonBase, int topBase, int height) {
        super(color);
        this.buttonBase = buttonBase;
        this.topBase = topBase;
        this.height = height;
    }

    protected int getButtonBase() {
        return buttonBase;
    }

    protected int getTopBase() {
        return topBase;
    }

    protected int getHeight() {
        return height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Isosceles trapezoid has drawn!");
    }

    @Override
    double getArea() {
        return (double) (buttonBase + topBase) / 2 * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + "button base: " + buttonBase + " units, "
                + "top base: " + topBase + " units, "
                + "height: " + height + " units.";
    }
}
