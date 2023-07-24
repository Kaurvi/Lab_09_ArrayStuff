import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int Array_Size =100;
        int[] dataPoints = new int[Array_Size];
        for(int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < dataPoints.length; e++) {
            System.out.printf("%5d|", dataPoints[e]);
        }
        System.out.println("");

        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++) {
            sum = sum + dataPoints[e];
        }
        int ave = sum / dataPoints.length;
        System.out.println ("The sum of the random array dataPoints is " +sum);
        System.out.println("The average of the random array dataPoints is " + ave);


        int searchTarget = 0;
        int targetCount=0;
        boolean foundTarget = false;
        searchTarget = SafeInput.getRangedInt (in, "Enter value for search :", 1,100);

        for (int e= 0; e< dataPoints.length; e++)
         {
             if (dataPoints[e]== searchTarget)
             { foundTarget=true;
                 System.out.println ("Found "+searchTarget + "at index" +e);
             }
         } if (!foundTarget)
         {
          System.out.println ("Target" +searchTarget + "Not found!");
         }
        foundTarget =false;
        for (int e : dataPoints )
        {
            if( e== searchTarget) targetCount++;
        }
        System.out.println ("The user's value is found"+targetCount+"times");

        searchTarget =SafeInput.getRangedInt ( in,"Enter another int",1,100 );
        for(int e =0; e < dataPoints.length;e++){
            if (dataPoints[e]==searchTarget)
            {foundTarget =true;
                System.out.println ("The another int"+searchTarget + "found at index"+e);
            break;
            }
        } if(!foundTarget)
        {
            System.out.println ("The value"+searchTarget+"Not found!");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int e = 0; e< dataPoints.length; e++)
        {if (min > dataPoints[e])
        {min = dataPoints[e];
        }
        if(max < dataPoints[e]) {
            max = dataPoints[e];}
        }
        System.out.println ("The min is "+ min);
        System.out.println ("The max is "+ max);

    } public static double getAverage (double values[])
    {double sum = 0;
    double average = 0;
    if (values != null && values.length!=0){
        for (double d: values){
            sum = sum +d ;
        }
     } average = sum / values.length;
    return average;
    }public static int min(int values[]) {
        int min = values[0];
        for (int c = 1; c < values.length; c++) {
            if (values[c] < min) {
                min = values[c];
            }
        }
        return min;
    }
    public static int max(int values[]) {
        int max = values[0];
        for (int c = 1; c < values.length; c++) {
            if (values[c] > max) {
                max = values[c];
            }
        }
        return max;
    }
    public static int occurrenceScan(int values[], int target) {
        int count = 0;
        for (int c = 0; c < values.length; c++) {
            if (values[c] == target) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int values[]) {
        int sum = 0;
        for (int c = 0; c < values.length; c++) {
            sum += values[c];
        }
        return sum;
    }
    public boolean contains(int values[], int target) {
        for (int c = 0; c < values.length; c++) {
            if (values[c] == target) {
                return true;
            }
        }
        return false;
    }
}

