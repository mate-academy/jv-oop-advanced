package core.basesyntax;

import java.awt.*;

public class Square extends Figure implements Drawable {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return null;
    }
}
