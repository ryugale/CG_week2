public class two {
    public static void main(String[] args) {
    String s = "apple";
    String r = "";
    for (int i = s.length() - 1; i >= 0; i--) {
    r += s.charAt(i);
    }
    System.out.println(r);
    }
   }   