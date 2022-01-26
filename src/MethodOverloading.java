public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Asep");
        sayHello("Asep","Saepudin");

    }

    static void sayHello(){
        System.out.println("Hello World");
    }
    static void sayHello ( String name){
        System.out.println("Hello "+name);
    }
    static void sayHello ( String name, String lastName){
        System.out.println("Hello "+name+" "+lastName);
    }
}
