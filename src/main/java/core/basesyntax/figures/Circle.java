package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Figures;

public class Circle extends Figure {
    private final int radius;
    private final int diameter;

    public Circle(String color, int radius) {
        super(Figures.CIRCLE, color);
        this.radius = radius;
        this.diameter = radius * 2;
        this.setArea(getArea());
    }

    @Override
    public float getArea() {
        return (float) Math.PI * (this.radius * this.radius);
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", radius: "
                + this.radius
                + " units, diameter: "
                + this.diameter
                + " units"
        );
    }
}
