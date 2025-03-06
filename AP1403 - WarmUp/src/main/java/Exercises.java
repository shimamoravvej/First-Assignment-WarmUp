public class Exercises {
    
    public boolean isPrime(long n) {
        if (n < 2 || n % 2 == 0){
            return false;}
        elseif (n == 2) {
            return true;}
        for (long i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) 
                return false;}
        
        return false;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
