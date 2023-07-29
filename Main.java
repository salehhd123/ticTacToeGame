import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner inp = new Scanner(System.in);
    public static String userMove;
    public static int computerMove;
    public static void printArray(){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println(arr[0][0]+"|"+arr[0][1]+"|"+arr[0][2]);
        System.out.println("-+-+-");
        System.out.println(arr[1][0]+"|"+arr[1][1]+"|"+arr[1][2]);
        System.out.println("-+-+-");
        System.out.println(arr[2][0]+"|"+arr[2][1]+"|"+arr[2][2]);

    }

    public static char [][] arr= {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};


    public static void userEnter(String a){
        switch(userMove) {
            case "1":
                arr[0][0] = 'x';
                break;
            case "2":
                arr[0][1] = 'x';
                break;
            case "3":
                arr[0][2] = 'x';
                break;
            case "4":
                arr[1][0] = 'x';
                break;
            case "5":
                arr[1][1] = 'x';
                break;
            case "6":
                arr[1][2] = 'x';
                break;
            case "7":
                arr[2][0] = 'x';
                break;
            case "8":
                arr[2][1] = 'x';
                break;
            case "9":
                arr[2][2] = 'x';
                break;
        }
    }

    public static void computerEnter(int a){
        switch(a) {
            case 1:
                arr[0][0] = 'o';
                break;
            case 2:
                arr[0][1] = 'o';
                break;
            case 3:
                arr[0][2] = 'o';
                break;
            case 4:
                arr[1][0] = 'o';
                break;
            case 5:
                arr[1][1] = 'o';
                break;
            case 6:
                arr[1][2] = 'o';
                break;
            case 7:
                arr[2][0] = 'o';
                break;
            case 8:
                arr[2][1] = 'o';
                break;
            case 9:
                arr[2][2] = 'o';
                break;
        }
    }
    public static boolean empty(int a) {
        switch (a) {
            case 1:
                if (arr[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if(arr[0][1]==' '){
                    return true;
                }else {
                    return false;
                }
            case 3:
                if(arr[0][2]==' '){
                    return true;
                }else {
                    return false;
                }
            case 4:
                if(arr[1][0]==' '){
                    return true;
                }else {
                    return false;
                }
            case 5:
                if(arr[1][1]==' '){
                    return true;
                }else {
                    return false;
                }
            case 6:
                if(arr[1][2]==' '){
                    return true;
                }else {
                    return false;
                }
            case 7:
                if(arr[2][0]==' '){
                    return true;
                }else {
                    return false;
                }
            case 8:
                if(arr[2][1]==' '){
                    return true;
                }else {
                    return false;
                }
            case 9:
                if(arr[2][2]==' '){
                    return true;
                }else {
                    return false;
                }
            default: return false;
        }
    }

    public static boolean checkWinner() {
        if (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' ||
                arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ||
                arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' ||
                arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x' ||
                arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' ||
                arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x' ||
                arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' ||
                arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'
        ) {
            System.out.println("you beat the system !");
            printArray();
            return true;
        } else if (arr[0][0] == 'o' && arr[0][1] == 'o'  && arr[0][2] == 'o'  ||
                arr[1][0] == 'o'  && arr[1][1] == 'o'  && arr[1][2] == 'o'  ||
                arr[2][0] == 'o'  && arr[2][1] == 'o'  && arr[2][2] == 'o'  ||
                arr[0][0] == 'o'  && arr[1][0] == 'o'  && arr[2][0] == 'o'  ||
                arr[0][1] == 'o'  && arr[1][1] == 'o'  && arr[2][1] == 'o'  ||
                arr[0][2] == 'o'  && arr[1][2] == 'o'  && arr[2][2] == 'o'  ||
                arr[0][0] == 'o'  && arr[1][1] == 'o'  && arr[2][2] == 'o'  ||
                arr[0][2] == 'o'  && arr[1][1] == 'o'  && arr[2][0] == 'o') {
            System.out.println("the computer win sry !");
            printArray();
            return true;
        } else return false;
    }

    public static boolean validMoveByUser(String a) {
        switch (a) {
            case "1":
                if (arr[0][0] == ' ') {
                    return true;
                } else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "2":
                if(arr[0][1]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "3":
                if(arr[0][2]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "4":
                if(arr[1][0]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "5":
                if(arr[1][1]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "6":
                if(arr[1][2]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "7":
                if(arr[2][0]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "8":
                if(arr[2][1]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            case "9":
                if(arr[2][2]==' '){
                    return true;
                }else {
                    System.out.println("already taken chose again !");
                    return false;
                }
            default:
                System.out.println("invalid enter please enter between 1-9");
                return false;
        }
    }

    public static void main(String[] args) {
        Random ran = new Random();
        while (true) {
        System.out.println("enter number between 1-9 !");
            //check user only taken empty place and must enter between 1-9 !
            userMove = inp.nextLine();
            while (!validMoveByUser(userMove)){
                userMove = inp.nextLine();
            }
            userEnter(userMove);

            if(checkWinner()){
                break;
                }else {
                int computerMove;

                //check computer only taken empty place !
                while (true) {
                    computerMove = ran.nextInt(9) + 1;
                    if (empty(computerMove)) {
                        break;
                    }
                }

                System.out.println("computer chose :"+computerMove);
                computerEnter(computerMove);
                if (checkWinner()){
                    break;
                }else printArray();

                }
            }
        }
    }
