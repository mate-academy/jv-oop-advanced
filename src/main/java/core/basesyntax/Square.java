package core.basesyntax;

public class Square extends FigureSupplier implements BehaviourFigures {
    Square() {
        this.setName("Square");
        this.setSizeA(random.nextInt(MAX_NUMBER));
        this.setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public Figure getRandomFigure() {
        Figure square = new Figure();
        square.setArea(Math.pow(getSizeA(), 2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ").append(this.getName()).append(", area: ")
                .append(square.getArea()).append(" sq.units, side: ")
                .append(getSizeA()).append(" units, color: ")
                .append(getColor());
        square.setText(stringBuilder.toString());
        return square;
    }
}
