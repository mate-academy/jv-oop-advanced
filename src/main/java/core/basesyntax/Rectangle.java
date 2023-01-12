package core.basesyntax;

import java.awt.*;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.width = width;
        this.length = length;
    }
}
