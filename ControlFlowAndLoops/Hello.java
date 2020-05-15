public class Hello {

    public static void main(String[] args) {

        System.out.println("hello, World!!"); //hello, World!
        int myNum = (25+5) - (5*1);  //Declaring Int Variable
        int myNum2 = 12;
        int myNum3 = 6;
        int total = myNum + myNum2 + myNum3;  //43
        int myLastOne = 1000 - total; //957
        System.out.println(myLastOne); //957
        //Primitive Data Type: INT
        int myValue = 10000;
        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MAX_VALUE;
        System.out.println("Minimum Value of Integer is: " + minIntVal);
        System.out.println("Maximum value of Integer is: " + maxIntVal);

        //Primitive Data Type: Byte
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Minimum Value of Byte is: " + minByteVal);
        System.out.println("Maximum value of Byte is: " + maxByteVal);

        //Primitive Data Type: Short
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Minimum Value of Short is: " + minShortVal);
        System.out.println("Maximum value of Short is: " + maxShortVal);

        //Primitive Data Type: Long
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Minimum Value of Long is: " + minLongVal);
        System.out.println("Maximum value of Long is: " + maxLongVal);

        byte casting = (byte)(minByteVal/2); //type casting to byte
        byte num1 = 101;
        short num2 =  32000;
        int num3 = 100000;
        long num4 = 50000+10*(num1 + num2 + num3);
        System.out.println("The answer of the challenge is : " + num4);

        //Primitive Data Type: Float
        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("Minimum Value of Float is: " + minFloatVal);
        System.out.println("Maximum value of Float is: " + maxFloatVal);

        //Primitive Data Type: Double
        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Minimum Value of Double is: " + minDoubleVal);
        System.out.println("Maximum value of Double is: " + maxDoubleVal);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("int value: " + myInt);
        System.out.println("float value: " + myFloat);
        System.out.println("double Value: " + myDouble);

        int pounds = 200;
        float Kilos = (float)(pounds * 0.45359237);
        System.out.println("Conversion of 10 pounds in Kilos is: " + Kilos);

        //Primitive Data Type: CHAR
        char myChar = 'K';

        //Primitive Data Type: BOOLEAN
        boolean myBool = true;

        //Operator Challenge
        double d1 = 20.00d;
        double d2 = 80.00d;
        double sum = (d1 + d2) * 100.00d;
        double remainder = sum % 40.00d;
        boolean res = remainder == 0 ? true : false;
        System.out.println(res);
        if (!res){
            System.out.println("Got some remainder");
        }
        displayHighScorePosition("Kevin", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Chut", calculateHighScorePosition(400));
        displayHighScorePosition("Lod", calculateHighScorePosition(50));
    }
    //Methods Challenge
    public static void displayHighScorePosition (String player, int Pos){
        System.out.println(player + " managed to get into position " + Pos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        int pos = 4;
        if (score >= 1000){
            pos = 1;
        }else if (score >= 500){
            pos = 2;
        }else if (score >= 100){
            pos = 3;
        }
         return pos;
    }
}
