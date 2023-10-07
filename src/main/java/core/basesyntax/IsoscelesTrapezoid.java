package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int firstLeg;
    private final int secondLeg;

    public IsoscelesTrapezoid(Color colors, Form forms, int firstLeg, int secondLeg) {
        super(forms, colors);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + this.firstLeg * secondLeg
                + "sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + this.getColors());
        return this;
    }
}
