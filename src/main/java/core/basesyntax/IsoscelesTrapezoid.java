package core.basesyntax;
//       \_/ (1 сторона + 2 сторона )/ 2 * высоту
public class IsoscelesTrapezoid extends Figure implements Draw, Area  {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, " + "square=" + getArea() +"sq.units, firstLeg=" + firstLeg
                + "units, secondLeg=" + secondLeg + "units, height=" + height + "units, color=" + getColor() + '.';
    }
}

