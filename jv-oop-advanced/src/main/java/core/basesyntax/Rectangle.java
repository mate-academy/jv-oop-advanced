package core.basesyntax;

import static core.basesyntax.FigureSupplier.firstleg;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    public Rectangle(Form randomForm, Color randomColor, int firstleg, int secondLeg) {
        super(randomColor,randomForm);
        this.firstLeg = firstleg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: rectangle, area: " + this.firstLeg + secondLeg + "sq.units, firstLeg: "
                + this.firstLeg +" units, secondLeg: " + secondLeg + "units, color: " + this.getColors());
        return null;
    }
}
