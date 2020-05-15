public class DiagStar {
    public static void printSquareStar(int num){
        if(num < 5) {
            System.out.println("Invalid Value");
        }else{
            int rowCount = num-1;
            for (int rowNum = 0; rowNum < num; rowNum++){
                for(int colNum = 0; colNum < num; colNum++){
                    if((rowNum == colNum) || (rowNum == 0)|| (colNum == 0) ||(rowNum == num-1) || (colNum == num-1) || (colNum == (rowCount - rowNum))) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}