package core.basesyntax;

public class Rectangle extends FigureSupplier implements BehaviourFigures {
    Rectangle() {
        this.setSizeA(random.nextInt(MAX_NUMBER));
        this.setSizeB(random.nextInt(MAX_NUMBER));
        this.setName("Rectangle");
        this.setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public Figure getRandomFigure() {
        Figure rectangle = new Figure();
        rectangle.setArea(getSizeA() * getSizeB());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ").append(this.getName()).append(", area: ")
                .append(rectangle.getArea()).append(" sq.units, sideA: ").append(getSizeA())
                .append(" units, sideB: ").append(getSizeB()).append(" units, color: ")
                .append(getColor());
        rectangle.setText(stringBuilder.toString());
        return rectangle;
    }
}
