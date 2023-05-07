package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double weight;

    @Override
    public void drawArea() {
        System.out.println("Figure's area is " + height * weight);
    }
}
