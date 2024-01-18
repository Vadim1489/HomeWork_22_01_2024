class Main {
    public static void main(String[] args) {

        byte byteBox =126;
        short shortBox =127;
        shortBox = byteBox;

        System.out.println(shortBox);


        int intBox =4000;
        long longBox =5807;

        longBox = intBox;
        System.out.println(longBox);


        double doubleBox = 2.99952;
        float floatBox =1.9995F;

        doubleBox = floatBox;
        System.out.println(doubleBox);


        byte byteBox1 =126;
        short shortBox1 =127;

        byteBox1 = (byte)shortBox1;
        System.out.println(byteBox1);


        int intBox1 =4000;
        long longBox1 =5807;

        intBox1 = (int)longBox1;
        System.out.println(intBox1);
        

        double doubleBox1 = 2.99952;
        float floatBox1 =1.9995F;

        floatBox1 = (float) doubleBox1;
        System.out.println(floatBox1);



    }
}