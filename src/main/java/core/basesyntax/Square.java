package core.basesyntax;

public class Square extends Figure {
    private int side;
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void printInformation() {
        System.out.println();
    }
}
