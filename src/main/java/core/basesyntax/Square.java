package core.basesyntax;

public class Square extends Figure {
    private final double size;

    public Square(String colour, double size) {
        super(colour);
        this.size = roundValues(size);
    }

    @Override
    public double calculateArea() {
        return roundValues(size * size);
    }

    @Override
    public void draw() {
        String output = this.getColour() + " "
                + this.getClass().getSimpleName() + " Has a size :" + this.size
                + " units \nAnd it's area is :" + calculateArea()
                + " square units \n";
        System.out.println(output);
    }
}
