package core.basesyntax;

import static core.basesyntax.FigureSupplier.side;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(Color colors, Form forms) {
        super(colors, forms);
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + side * side
                + "sq.units, side: " + side + " units, color: " + this.getColors());
        return null;
    }
}
