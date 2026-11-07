import java.util.Scanner;
// testing logic
class Test{

    public static void main(String args[]){
        String player ;
        int choice ;
        Scanner sn = new Scanner(System.in);
        char[][] arr = new char[3][3];

        System.out.println("Enter values ");
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3 ; j++){
                for(int k=0;k<3;k++){                 
                    if(k==0){
                        player = "player1";
                    }else if (k==1) {
                        player = "player2";
                    }
                }
                choice = sn.nextInt();
                switch (choice) {
                    case 1:
                        arr[0][0] = 'x';
                        System.out.println("inserted at 1st column");
                        break;
                    case 2:
                        arr[0][1] = 'x';
                        System.out.println("inserted at 2nd column");
                        break;
                    case 3:
                        arr[0][2]= 'x';
                        System.out.println("inserted at 3rd column");
                        break;
                    case 4:
                        arr[1][0] = 'x';
                        System.out.println("inserted at 4th column");
                        break;
                    case 5:
                        arr[1][1] = 'x';
                        System.out.println("inserted at 5th column");
                        break;
                    case 6:
                        arr[1][2] = 'x';
                        System.out.println("inserted at 6th column");
                        break;
                    case 7:
                        arr[2][0] = 'x';
                        System.out.println("inserted at 7th column");
                        break;
                    case 8:
                        arr[2][1] = 'x';
                        System.out.println("inserted at 8th column");
                        break;
                    case 9:
                        arr[2][2] = 'x';
                        System.out.println("inserted at 9th column");
                        break;
                    default:
                        System.err.println("Invalid output");
                        break;
                }
                
            }
        }

        for(int i=0;i<3;i++ ){
            for(int j=0;j<3;j++){
                System.out.print("| "+ arr[i][j] +" ");
                

            }
            System.out.print("|");
            System.out.println(" \n --------------");
        }

        System.out.println(arr.length);

    }
}