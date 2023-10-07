package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(Form randomForm, Color randomColor, int firstleg, int secondLeg) {
        super(randomForm, randomColor);
        this.firstLeg = firstleg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: rectangle, area: "
                + this.firstLeg + secondLeg + "sq.units, firstLeg: "
                + this.firstLeg + " units, secondLeg: " + secondLeg
                + "units, color: " + this.getColors());
        return this;
    }
}
