package core.basesyntax;
import static core.basesyntax.FigureSupplier.side;

public class Square extends Figure {
    private final int side;

    public Square(Form randomForm, Color randomColor, int side) {
        super(randomColor, randomForm);
        this.side = side;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + side * side
                + "sq.units, side: " + side + " units, color: " + this.getColors());
        return null;
    }
}
