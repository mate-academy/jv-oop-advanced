package core.basesyntax;

public abstract class Figure implements FigureCalculations, FigureFunctions {
    private Color color;


    public Figure(Color color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void draw() {
        System.out.println(this);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
