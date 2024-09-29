import java.util.Scanner;
class MergeStrings {
    public static void main(String[] args)
    {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        s1 = sc.next();
        System.out.println("Enter second string: ");
        s2 = sc.next();
        StringBuilder mergedString = new StringBuilder(); 
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            mergedString.append(s1.charAt(i)); 
            mergedString.append(s2.charAt(i));
        }
        if (s1.length() > minLength) {
            mergedString.append(s1.substring(minLength)); 
        } else if (s2.length() > minLength) {
            mergedString.append(s2.substring(minLength)); 
        }
        System.out.println("Merged String: " + mergedString);
         
    }
}