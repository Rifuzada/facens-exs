public class Main{
    public static void main(String[] args) {
        int[][] matrizInt = {{1,2},{1,3}};
        for(int i = 0; i < matrizInt.length;i++){
            for(int y = 0; y < matrizInt[i].length; y++){
                System.out.print(matrizInt[i][y]+" ");
            }
            System.out.println();   
        }
    }
}