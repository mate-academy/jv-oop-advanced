package core.basesyntax.figures;

import core.basesyntax.Figure;

import java.util.Random;

public class Square extends Figure {
    private int side;
    private Random random = new Random();

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        setFigureName("square");
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void setRandomProperties() {
        setSide(random.nextInt(20));
    }
}
