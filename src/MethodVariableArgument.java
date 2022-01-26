public class MethodVariableArgument {
    public static void main(String[] args) {
        int[]values= {80,80,80,50,80};
        sayCongrat("Eko",values);
        sayCongrat("Asep",90,80,79,78);

    }
    static void sayCongrat(String name, int... values){
        var total=0;
        for ( var value : values){
            total += value;
        }
        var finalValue= total /values.length;

        if (finalValue >= 75){
            System.out.println("selamat "+ name +" anda lulus");
        } else {
            System.out.println("Maaf "+ name +" anda tidak lulus");
        }


    }
}
