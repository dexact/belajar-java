public class DataTypeArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0]="Asep";
        arrayString[1]="Saepudin";
        arrayString[2]="kereeeen";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
                10,11,12,13,14
        };

        System.out.println(arrayInt[1]);

        long[] arrayLong={
                10L,20L,30L
        };
        arrayLong[0]=0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length);


        String[][] namaLengkap = {
                {"Asep ","Efi "},
                {"Saepudin ","Shofiyanti "},
                {"Ganteng ","Cantik "}

        };
        System.out.print(namaLengkap[0][0]);
        System.out.print(namaLengkap[1][0]);
        System.out.print(namaLengkap[2][0]);


    }


}
