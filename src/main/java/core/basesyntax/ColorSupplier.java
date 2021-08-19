package core.basesyntax;

public class ColorSupplier {
    private String figureColor;
    private String[] colorVariations = new String[]
            {"Red", "Blue", "Green", "White", "Black", "Pink", "Gold", "Silver", "Trans", "Rain"};

    public String getRandomColor() {
        return colorVariations[(int) (Math.random() * 10)];
    }
}
