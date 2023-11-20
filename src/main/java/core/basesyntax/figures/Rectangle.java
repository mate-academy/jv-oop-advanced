package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Draw;

public class Rectangle extends Figure implements Area, Draw {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle{color: "
                + getColor()
                + "; length: "
                + length
                + "; width: "
                + width
                + "; area: "
                + getArea()
                + "}");
    }
}
