public class Runner {
    public static int countCode(String str) {
        int count = 0;
        String s;
        if (str.length() < 4) {return 0;}

        for (int i = 0; (i + 4) < str.length(); ++i)
        {
            s = str.substring(i, i + 4);
            if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'o' && s.charAt(i + 3) == 'e')
            {
                count++;
            }

        }
        return count;
    }
}
