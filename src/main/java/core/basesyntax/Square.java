package core.basesyntax;

import java.awt.*;

public class Square extends Figure{
    private double side;
    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }
}
