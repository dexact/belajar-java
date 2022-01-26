public class breakAndContinue {
    public static void main(String[] args) {
        var counter=1;

        while(true){
            System.out.println("perulangan ke "+counter);
            counter++;

            if (counter > 10){
                break;
            }
        }
        System.out.println("perulangan berhenti");

        for (int counter1=1;counter1<=100;counter1++){
            if (counter1 % 2 !=0) {
                continue;
            }
            System.out.println(counter1);

        }
    }
}
