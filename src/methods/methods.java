package methods;

public class methods {
    static void main () {
        //invoking a method
//        methodName (arguments)
        System.out.println(getMax(23,56));

        pattern1(5);
        pattern2(5);

        int result = multiply(5,20);
        System.out.println(result);
        System.out.println(multiply(5,6));
    }


    //syntax
//  returnType methodName (parameter){
//      code;
//  }
    static int getMax(int a, int b){
        int result = Math.max(a,b);
        return result;
    }

    static void pattern1 (int n) {
        for(int i = 1; i <= n; i++){
            for(int k = 0; k < n-i; k++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            for(int l = 1; l < i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2 (int n) {
        for (int i = 0; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int k = 0; k < n-i; k++){
                System.out.print("* ");
            }
            for (int k = 1; k < n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int multiply (int x, int y){
        int multiply = x * y;
        return multiply;
    }

}
