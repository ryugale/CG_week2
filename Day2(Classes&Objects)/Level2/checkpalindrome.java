class Palindrome{
    String text;

    public Palindrome(String text){
        this.text = text;
    }

    public boolean  PalindromeChecker(){
        String newtext = "";
        for (int i = text.length() - 1; i >= 0  ; i--) {
            newtext += text.charAt(i);
        }
        return text.equals(newtext);
    }
    void DisplayResult(){
        if (PalindromeChecker()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a Palindrome.");
        }
    }
    public static void main(String[] args) {
        Palindrome myobj = new Palindrome("mumum");
        myobj.DisplayResult();

    }
}