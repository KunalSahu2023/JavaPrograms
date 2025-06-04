package Conditional;

public class ThreeDigit {
    
    public static void main(String[] args) {
        int n=1886;
        String result=(n>=100 && n<=999)?n+" is a 3-digit Number": n+" is NOT a 3-digit Number";
        System.out.println(result);
    }
}
