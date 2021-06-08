public class Task3{
    public static void main(String[] args){
        System.out.println(isPalindrome("123"));
        System.out.println(isPalindrome("123321"));
        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12321"));
    }

    public static boolean isPalindrome(String numberAsString){
        StringBuilder numberAsStringModify = new StringBuilder(numberAsString);
        return (numberAsString.equals(numberAsStringModify.reverse().toString()));
    }
}