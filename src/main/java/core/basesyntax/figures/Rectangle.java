package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int horizontalSide;
    private int verticalSide;

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, int horizontalSide, int verticalSide) {
        super(color);
        this.horizontalSide = horizontalSide;
        this.verticalSide = verticalSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has " + getColor() + "color."
                + "Sides lengh is " + horizontalSide + " and " + verticalSide
                + ". Area is " + getArea());
    }

    @Override
    public double getArea() {
        return horizontalSide * verticalSide;
    }
}
