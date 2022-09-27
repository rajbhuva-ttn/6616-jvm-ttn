public class Example4
{
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [] sumRow = new int[3];
        int [] sumcol = new int[3];

        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                sumRow[row] += arr[row][col];
                sumcol[col] += arr[row][col];
            }
        }

        System.out.println("Sum of all elements of each column = C1-"+sumcol[0]+"\tC2-"+sumcol[1]+"\tC3-"+sumcol[2]);
        System.out.println("Sum of all elements of each row = R1-"+sumRow[0]+"\tR2-"+sumRow[1]+"\tR3-"+sumRow[2]);
    }
}