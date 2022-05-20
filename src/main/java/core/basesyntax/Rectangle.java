package core.basesyntax;

public class Rectangle extends Figure {
    private final double smallSide;
    private final double bigSide;

    public Rectangle(String colour, double smallSide, double bigSide) {
        super(colour);
        this.smallSide = roundValues(smallSide);
        this.bigSide = roundValues(bigSide);
    }

    @Override
    public double calculateArea() {
        return roundValues(smallSide * bigSide);
    }

    @Override
    public void draw() {
        String output = this.getColour() + " "
                + this.getClass().getSimpleName() + " Has a smaller side :"
                + this.smallSide + " units \nThe bigger is :" + this.bigSide
                + " units \nAnd it's area is :" + calculateArea()
                + " square units \n";
        System.out.println(output);
    }
}
