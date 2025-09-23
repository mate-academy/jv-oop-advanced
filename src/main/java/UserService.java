public class UserService {
    private static final int INDEX_OF_USER_EMAIL = 0;
    private static final int INDEX_OF_USER_SCORE = 1;
    private static final String[] basicRecords = {"john@gmail.com:78", "rick@yahoo.com:99",
            "greg@gmail.com:20", "russell@mail.us:141", "jerry@mail.us:0", "mortimer@mail.us:53",
            "test@gmail.com:2", "bob@mail.com:141986"};

    public static int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            String[] currentUser = records[i].split(":");
            if (currentUser[INDEX_OF_USER_EMAIL].equals(email)) {
                return Integer.parseInt(currentUser[INDEX_OF_USER_SCORE]);
            }
        }

        return 0;
    }
}
