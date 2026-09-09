package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(Colors color, int width, int height) {
        super(Figures.RECTANGLE, color);

        this.width = width;
        this.height = height;
        this.setArea(obtainArea());
    }

    @Override
    public float obtainArea() {
        float area = this.width * this.height;
        setArea(area);
        return area ;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", height: "
                + this.height
                + ", width: "
                + this.width);
    }
}
