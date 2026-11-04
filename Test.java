import java.util.Scanner;
// testing logic
class Test{

    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter values ");
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3 ; j++){
                arr[i][j] = sn.nextInt();
            }
        }

        for(int i=0;i<3;i++ ){
            for(int j=0;j<3;j++){
                System.out.print("| "+ arr[i][j] +" ");
                

            }
            System.out.print("|");
            System.out.println(" \n --------------");
        }

    }
}