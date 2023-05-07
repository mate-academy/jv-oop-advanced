package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public void drawArea() {
        System.out.println("Figure's area is " + side * side);
    }
}
