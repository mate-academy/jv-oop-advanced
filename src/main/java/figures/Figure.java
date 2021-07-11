package figures;

import randomiser.Color;

public abstract class Figure implements Drawable, SquareCalculate, PerimeterCalculate {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println();
    }
}
