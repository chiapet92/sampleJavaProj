public class Sorter {
    public static Comparator<String> LibraryEntryComparator = new Comparator<String>() {

        public int compare(String string1, String string2) {

            // String fruitName1 = fruit1.getFruitName().toUpperCase();
            // String fruitName2 = fruit2.getFruitName().toUpperCase();

            // ascending order
            return fruitName1.compareTo(fruitName2);

            // descending order
            // return fruitName2.compareTo(fruitName1);
        }

    };
    public static void main(String[] args) {
        String[] input = new String[5];
        Set<Character> uniqueChar = new HashSet<character>();
    }
}

// ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;

