package core.basesyntax;

public class Square extends Figure {
    private final double size;

    public Square(String colour, double size) {
        super(colour);
        this.size = super.roundValues(size);
    }

    @Override
    public double calculateArea() {
        return super.roundValues(size * size);
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

//    public void draw() {
//        StringBuilder output = new StringBuilder();
//        output.append(this.getClass().getSimpleName()).append("Has a size :").append(this.size)
//                .append(" units \nAnd it's area is :").append(calculateArea())
//                .append(" square units \n");
//        System.out.println(output.toString());
//    }
