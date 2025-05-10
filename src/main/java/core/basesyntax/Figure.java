package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements IDrawable, IAreaCalculator {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Figure : ");
    }
}
