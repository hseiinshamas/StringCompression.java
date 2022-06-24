public class Compress {

                           // aabcccccaaa -> a2bc5a3       -String compression-


    public static String compressed(String original) {
        int count = 1;
        String s = original.substring(0, 1);

        for (int i = 1; i < original.length(); i++) {
            char current = original.charAt(i);
            char previous = original.charAt(i - 1);

            if (current == previous) {
                count++;
            }

            else {

                if (count > 1) {
                    s += count;
                    count = 1;
                }

                s += current;
            }
        }
        if (count > 1) {
            s += count;
            count = 1;

        }

        return s;
    }
}
