import java.util.Scanner;

public class WordDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String w1 = sc.nextLine().trim();
        String w2 = sc.nextLine().trim();
        String[] str = s.split("\\s+");
        int min_dis = Integer.MAX_VALUE;
        int index1 = -1, index2 = -1;
        boolean found = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(w1)) {
                if (w1.equals(w2) && found) { //If two words are same check for multiple occurrences
                    index1 = index2;
                    index2 = i;
                } else {
                    index1 = i;
                }
                found = true;
            } else if (str[i].equals(w2)) {
                index2 = i;
                found = true;
            }

            if (index1 != -1 && index2 != -1) {
                min_dis = Math.min(min_dis, Math.abs(index1 - index2));
            }
        }

        if (min_dis == Integer.MAX_VALUE || w1.equals(w2)) {
            min_dis = -1; // If either word is not found in the sentence or both words are the same
        }

        System.out.print(min_dis);
    }
}
