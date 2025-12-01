package ua.university;


import java.util.Set;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    private static final Set<Character> VOWELS = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double[] result = new double[2];
        result[0] = a + b + c;
        result[1] = (a + b + c) / 3.0;
        return result;
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        if(a>b && a>c) return a;
        if(b>a && b>c) return b;
        return c;
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if(score > 100 || score < 0) throw new IllegalArgumentException();
        if(score >= 90) return 'A';
        if(score >= 80) return 'B';
        if(score >= 70) return 'C';
        if(score >= 60) return 'D';
        if(score >= 50) return 'E';
        if(score >= 40) return 'F';
        throw new IllegalArgumentException();
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch(day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if(n<=0) throw new IllegalArgumentException();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) result[i] = n - i;
        return result;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if(n<0) throw new IllegalArgumentException();
        if(n==0) return 1;
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if(arr==null || arr.length==0) throw new IllegalArgumentException();
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) result[i] = arr[arr.length-1-i];
        return result;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if(matrix==null || matrix.length==0) throw  new IllegalArgumentException();
        int result = 0;
        for(int row=0; row<matrix.length; row++) {
            for(int col=0; col<matrix[row].length; col++) {
                result += matrix[row][col];
            }
        }
        return result;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if(s==null || s.length()==0) throw new IllegalArgumentException();
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if(arr.length==0) throw new IllegalArgumentException();
        int[] result = new int[2];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > result[1]) result[1] = arr[i];
            if(arr[i] < result[0]) result[0] = arr[i];
        }
        return result;
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if(n<=0) throw new IllegalArgumentException();
        int[][] result = new int[n][n];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                result[i-1][j-1] = i*j;
            }
        }
        return result;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if(n<0) throw new IllegalArgumentException();
        int[] result = new int[n/2];
        for(int i=2; i<=n; i+=2) result[i/2-1] = i;
        return result;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        for(int i=2; i*i<=n; i+=2) if(n%i==0) return false;
        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(VOWELS.contains(s.charAt(i))) count++;
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if(n<0) throw new IllegalArgumentException();
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for(int i=3; i<n; i++) result[i] = result[i-1] + result[i-2];
        return result;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        int[] result = arr.clone();
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result.length-1; j++)
                if(result[j] > result[j+1]) {
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
        }
        return result;
    }

}
