package core.basesyntax;

public class Rectangle extends Figure {
    private double smallSide;
    private double bigSide;

    public Rectangle(String colour, double smallSide, double bigSide) {
        super(colour);
        setSmallSide(smallSide);
        setBigSide(bigSide);
    }

    public void setSmallSide(double smallSide) {
        this.smallSide = roundValues(smallSide);
    }

    public void setBigSide(double bigSide) {
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
