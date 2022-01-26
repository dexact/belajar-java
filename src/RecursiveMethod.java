public class RecursiveMethod {
    public static void main(String[] args) {
      //  System.out.println(factorialRecursive(5));
        loop(100000);

    }
    static int factorial(int value){
        var result=1;
        for (var counter = 1; counter <= value;counter++){
            result *=counter;
         //   System.out.println(result+" "+counter);
        }
        return  result;

    }
    static int factorialRecursive(int value){
        if ( value==1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }
    static void loop ( int value){
        if (value==0){
            System.out.println("selesai");
        }else{
            System.out.println("loop "+ value);
            loop(value-1);
        }
    }
}
