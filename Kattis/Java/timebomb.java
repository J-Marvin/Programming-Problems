import java.util.Scanner;

public class ASCIIAdd{

    private static String[][] numbers;

    public static void main(String[] args){
        numbers = new String[11][7];
        String[] input = new String[7];
        int i;

        Scanner sc = new Scanner(System.in);

        numbers[0][0] = "***";
        numbers[0][1] = "* *";
        numbers[0][2] = "* *";
        numbers[0][3] = "* *";
        numbers[0][4] = "* *";
        numbers[0][5] = "* *";
        numbers[0][6] = "***";

        numbers[1][0] = "  *";
        numbers[1][1] = "  *";
        numbers[1][2] = "  *";
        numbers[1][3] = "  *";
        numbers[1][4] = "  *";
        numbers[1][5] = "  *";
        numbers[1][6] = "  *";

        numbers[2][0] = "***";
        numbers[2][1] = "  *";
        numbers[2][2] = "  *";
        numbers[2][3] = "***";
        numbers[2][4] = "*  ";
        numbers[2][5] = "*  ";
        numbers[2][6] = "***";

        numbers[3][0] = "***";
        numbers[3][1] = "  *";
        numbers[3][2] = "  *";
        numbers[3][3] = "***";
        numbers[3][4] = "  *";
        numbers[3][5] = "  *";
        numbers[3][6] = "***";

        numbers[4][0] = "* *";
        numbers[4][1] = "* *";
        numbers[4][2] = "* *";
        numbers[4][3] = "***";
        numbers[4][4] = "  *";
        numbers[4][5] = "  *";
        numbers[4][6] = "  *";

        numbers[5][0] = "***";
        numbers[5][1] = "*  ";
        numbers[5][2] = "*  ";
        numbers[5][3] = "***";
        numbers[5][4] = "  *";
        numbers[5][5] = "  *";
        numbers[5][6] = "***";

        numbers[6][0] = "***";
        numbers[6][1] = "*  ";
        numbers[6][2] = "*  ";
        numbers[6][3] = "***";
        numbers[6][4] = "* *";
        numbers[6][5] = "* *";
        numbers[6][6] = "***";

        numbers[7][0] = "***";
        numbers[7][1] = "  *";
        numbers[7][2] = "  *";
        numbers[7][3] = "  *";
        numbers[7][4] = "  *";
        numbers[7][5] = "  *";
        numbers[7][6] = "  *";

        numbers[8][0] = "***";
        numbers[8][1] = "* *";
        numbers[8][2] = "* *";
        numbers[8][3] = "***";
        numbers[8][4] = "* *";
        numbers[8][5] = "* *";
        numbers[8][6] = "***";

        numbers[9][0] = "***";
        numbers[9][1] = "* *";
        numbers[9][2] = "* *";
        numbers[9][3] = "***";
        numbers[9][4] = "  *";
        numbers[9][5] = "  *";
        numbers[9][6] = "***";
        
        numbers[10][0] = "....";
        numbers[10][1] = "..x.";
        numbers[10][2] = "..x.";
        numbers[10][3] = "xxxx";
        numbers[10][4] = "..x.";
        numbers[10][5] = "..x.";
        numbers[10][6] = "....";

        for(i = 0; i < 7; i++)
            input[i] = sc.nextLine();

        showNum(getSum(input));

    }

    public static int getSum(String equation[]){

        int num1 = 0;
        int num2 = 0;
        int i;

        int index = 0;
        boolean isFirstNum = true;

        String digit[] = new String[7];

        while(index < equation[0].length()){
            for(i = 0; i < 7; i++)
                digit[i] = equation[i].substring(index, index + 5);
            index += 6;

            if(getNumber(digit) == 10)
                isFirstNum = false;
            else{
                if(isFirstNum){
                    num1 *= 10;
                    num1 += getNumber(digit);
                }
                else{
                    num2 *=10;
                    num2 += getNumber(digit);
                }
            }
        }
        return num1 + num2;
    }   

    public static int getNumber(String number[]){
        int i, j;
        boolean isMatch;
        int finalNum = -1;

        for(i = 0; i < 11 && finalNum == -1; i++){

            isMatch = true;
            for(j = 0; j < 7 && isMatch; j++){

                if(!number[j].equals(numbers[i][j]))
                    isMatch = false;
            }

            if(isMatch)
                finalNum = i;
        }

        return finalNum;

    }

    public static void showNum(int num){

        int digit;
        int i;
        String[] number = new String[7];

        for(i = 0; i < 7; i ++)
            number[i] = "";

        while(num > 0){

            digit = num % 10;

            for(i = 0; i < 7; i ++)
                if(number[i] == "")
                    number[i] = numbers[digit][i];
                else
                    number[i] = numbers[digit][i] + "." +number[i];
            
            num /= 10;
        }

        for(i = 0; i < 7; i++)
            System.out.println(number[i]);
    }
}