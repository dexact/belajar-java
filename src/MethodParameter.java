public class MethodParameter {
    public static void main(String[] args) {
        sayHelloWorld("Asep","Saepudin");
        sayHelloWorld("Efi","Shofiyanti");
        sayHelloWorld("Haura","Nurasfi");

    }

    static void sayHelloWorld (String firstName,String lastName){
        System.out.println("hello "+firstName+" "+lastName);

    }
}
