package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstParallel;
    private double secondParallel;
    private double height;

    public IsoscelesTrapezoid(String name,
                              double firstParallel,
                              double secondParallel,
                              double height,
                              String color) {
        super(name, color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double obtainTheArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: " + super.getName().toLowerCase() + ", area: " + obtainTheArea()
                + " sq.units, firstParallel: " + this.firstParallel + " units, secondParallel: "
                + this.secondParallel + " units, height: " + this.height
                + " units, color: " + super.getColor().toLowerCase());
    }
}
