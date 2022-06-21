package day8;

public class Task1 {
    public static void main(String[] args) {
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 20000;

        String resultString = "";
        long startTime = System.currentTimeMillis();
        for(int index = MIN_VALUE; index < MAX_VALUE; index++){
            resultString += " " + index;
        }
        long stopTime = System.currentTimeMillis();
        long resultTimeString = stopTime - startTime;

        startTime = 0;
        stopTime = 0;
        StringBuilder resultStringBuilder = new StringBuilder();

        startTime = System.currentTimeMillis();
        for(int index = MIN_VALUE; index < MAX_VALUE; index++){
            resultStringBuilder.append(" " ).append(index);
        }
        stopTime = System.currentTimeMillis();
        long resultTimeStringBuilder = stopTime  - startTime;

        System.out.println("String time = " + resultTimeString + ", StringBuilder time = " + resultTimeStringBuilder);
    }
}
