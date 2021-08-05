public class recursionProbs {
   static int stepCount = 0;
    public static void main(String[] args) {
            // QUE 1
            // System.out.println(sum(5));

            // // QUE 2
            // System.out.println(pow(3, 4000) + " is taking " + stepCount + " steps");
            // stepCount = 0;
            // System.out.println(fastPow(3, 4000) + " is taking " + stepCount + " steps");

            //  QUE 3 
            System.out.println(path(4, 4));

    }

    // QUE 1 -> FIND THE SUM OF FIRST N NATURAL NO USING RECURSION
    static int sum(int n) {
        if(n == 1 ) return 1;
        else return n + sum(n-1);
    }

    // QUE 2 -> CALCULATE POWER USING RECURSION 

    static int pow(int a , int b) {
        stepCount++;
        if(b == 0) return 1;
        else return a * pow(a , b-1); 
        
     }

     static int fastPow(int a , int b) {
         stepCount++;
         if(b == 0) return 1;
         if(b % 2 == 0) return fastPow(a*a , b/2);
         else return a * fastPow(a , b-1);

     }

    //  QUE 3 -> FIND ALL THE PATH IN N X M GRID
        
     static int path(int n , int m) {
         if(m == 1 || n == 1) return 1;
            return path(n, m-1) + path(m, n-1);
     }
}
