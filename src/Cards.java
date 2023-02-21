public class Cards {
    public static void main(String[] args) {
        int count =0;
        String[][] cards = {
                {"BLACK", "SPADE", "Q"},
                {"BLACK", "SPADE", "J"},
                {"Red", "SPADE", "Q"},
        };

        for (String[] card : cards) {
            if (card[0].equals("BLACK"))
                count++;
        }
        System.out.println("Number of BLACK cards : " +count);
    }

}


