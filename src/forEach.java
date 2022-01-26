public class forEach {
    public static void main(String[] args) {
        String[] names ={
                "Asep","saepudin","programmer",
                "jaman","now","sekarang"
        };

        for (var i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for ( var name:names){
            System.out.println(name);
        }
    }
}
