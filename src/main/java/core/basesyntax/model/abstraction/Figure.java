package core.basesyntax.model.abstraction;

public abstract class Figure implements DescribeFigures {
    protected String figureType = getClass().getSimpleName().toLowerCase();
    private Color color;

    protected Figure() {
    }

    protected Figure(Color color) {
        this.color = color;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

}
