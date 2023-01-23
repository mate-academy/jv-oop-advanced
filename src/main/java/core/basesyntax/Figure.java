package core.basesyntax;

public abstract class Figure implements Drawable {
    private Colors color;
    private Figures typeOfFigure;

    public Figure(Colors color, Figures typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    public Colors getColor() {
        return color;
    }

    public Figures getTypeOfFigure() {
        return typeOfFigure;
    }

    public double getSquare() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
