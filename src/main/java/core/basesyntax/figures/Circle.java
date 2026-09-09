package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;

public class Circle extends Figure {
    private int radius;
    private int diameter;

    public Circle (Colors color, int radius) {
        super(Figures.CIRCLE, color);
        this.radius = radius;
        this.diameter= radius * 2;
        this.setArea(obtainArea());
    }

    @Override
    public float obtainArea() {
        return (float) Math.PI * ( this.radius * this.radius);
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", radius: "
                + this.radius
                + ", diameter: "
                + this.diameter
        );
    }
}
