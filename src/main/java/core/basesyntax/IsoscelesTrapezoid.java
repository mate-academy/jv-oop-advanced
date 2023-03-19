package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLengthOfParallelSide;
    private double secondLengthOfParallelSide;
    private double height;

    @Override
    public double getArea() {
        return ((firstLengthOfParallelSide + secondLengthOfParallelSide) / 2) * height;
    }

    @Override
    public void printInformation() {
        System.out.println();
    }
}
