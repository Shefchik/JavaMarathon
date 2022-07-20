package day18;

public class Task2 {
    final static char CHECKED_NUMBER = '7';
    final static int DIVIDER= 10;
    public static void main(String[] args) {
        int number = 717771237;
        System.out.println(count7(number));
    }

    public static int count7(int number){
        String strNumber = String.valueOf(number);
        if (strNumber.equals("0")){
            return 0;
        }
        return ((strNumber.charAt(strNumber.length() - 1) == CHECKED_NUMBER) ? 1 : 0) + count7(number/DIVIDER);
    }
}
