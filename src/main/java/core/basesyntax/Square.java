package core.basesyntax;

public class Square extends Figure {
    public Square(String color) {
        super(color);
    }

    public Square() {
    }

    @Override
    public void draw() {

        System.out.println("Figure: Square," + " color: " + super.getColor());
    }
}
