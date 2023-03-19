package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLengthOfParallelSide;
    private double secondLengthOfParallelSide;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double firstLengthOfParallelSide, double secondLengthOfParallelSide, double height) {
        super.name = name;
        super.color = color;
        this.firstLengthOfParallelSide = firstLengthOfParallelSide;
        this.secondLengthOfParallelSide = secondLengthOfParallelSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLengthOfParallelSide + secondLengthOfParallelSide) / 2) * height;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + name + ", area: " + getArea() +
                " sq.units, height: " + height +
                " units, first length of parallel side: " +
                firstLengthOfParallelSide + " units, second length of parallel side: " +
                secondLengthOfParallelSide + " units, color: " + color);
    }
}
