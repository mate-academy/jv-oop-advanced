package core.basesyntax;

public class ColorSupplier {
    private static final String[] colors = {"Red", "Grey", "Light lue", "Dark blue", "Green",
            "Yellow", "Pink", "Orange", "Brown", "White", "Black", "Violet", "Gold", "Silver",
            "Amber", "Azure", "Beige", "Body colour", "Bronze", "Chocolate", "Coral", "Denim blue",
            "Lilac", "Pearl", "Raspberry", "Sand", "Snow", "Vinous", "Light sea green", "Red"};

    public String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
