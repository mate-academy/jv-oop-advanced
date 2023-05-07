package core.basesyntax;

public class Circle extends Figure {
    double radius;
    @Override
    public void drawArea() {
        System.out.println("Figure's area is " + Math.PI * radius * radius);
    }
}
