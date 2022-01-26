public class TypeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong =100L;

        Byte iniByte = 0;

        System.out.println(iniInteger);
        System.out.println(iniByte);

        Integer iniInteger2 = 100;

        short iniShort = iniInteger2.shortValue();
        byte iniByte2 = iniInteger2.byteValue();
        float iniFloat = iniInteger2.longValue();
    }
}
