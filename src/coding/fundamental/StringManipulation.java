package coding.fundamental;

public class StringManipulation {
    public static void main(String[] args) {
        var name = "animals";
        // System.out.println(name.length());
        // int len = name.length() - 1;
        // System.out.println(name.substring(2, 6));
        // System.out.println(name.indexOf("ma"));
        // System.out.println(name.toUpperCase());

        // searching substring

        String res = "AniMaL  ".trim().toLowerCase().replace('a', 'A');
        System.out.println(res);

        System.out.println("=================================");
        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace("C", "3");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        String alpha = "";
        for (char curr = 'a'; curr <= 'z'; curr++) {
            alpha += curr;
        }
        // System.out.println(alpha);

        // string builder
        StringBuilder s = new StringBuilder();
        for (char curr = 'a'; curr <= 'z'; curr++) {
            s.append(curr);
        }
        System.out.println(s);
        // System.out.println(s.codePointAt(15));
        // System.out.println(s.codePointAt(1));
        // System.out.println(s.codePointBefore(1));
        System.out.println(s.replace(1, 3, "XXX"));
        // System.out.println(s);
        System.out.println(s.toString().equals(alpha));
    }
}
