package core.basesyntax.figures;

import core.basesyntax.figures.interfaces.Drawable;
import core.basesyntax.figures.interfaces.ShapeCalculable;

public class Shape implements Drawable, ShapeCalculable {
    protected String color;

    Shape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("It's just a shape");
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
