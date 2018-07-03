import java.util.*;

class first{
    public static void main(String[] args) {
        String hi = "hi buddy! what are you doing right now  ";
        System.out.println(hi.trim());
        String[] words = hi.trim().split("[^a-zA-Z0-9']+");
        // words.remove("");

        // for (String i : words) {
        //     if (i.equals("")) {
                
        //     }
        // }
        // words = ArrayUtils.removeElement(words,"");
        List<String> list = new ArrayList<String>(Arrays.asList(words));
        list.remove("");
        words = list.toArray(new String[0]);

        for (int i = 0; i< words.length ;i++ ) {
            System.out.printf("%d : "+words[i]+"%n",i);
        }

        int[] eleven = new int[20];
        int[] twelve = {1,2,3};
        // System.out.println("Hello World");
        // System.out.print(hi);
        // System.out.print(hi);
        // System.out.println(twelve[0]);
        System.out.println(""+twelve.length);
        System.out.printf("Eleven's length: %d",eleven.length);
        System.out.println("/hi");
    }
}
