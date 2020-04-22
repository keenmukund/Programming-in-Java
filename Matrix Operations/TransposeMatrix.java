import java.util.Scanner;
class TransposeMatrix
{
  public static void main(String args[])
  {
    int m, n, a, b;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of matrix");
    m = in.nextInt();
    n = in.nextInt();

    int matrix[][] = new int[m][n];

    System.out.println("Enter elements of the matrix");

    for (a = 0; a < m; a++)
      for (b = 0; b < n; b++)
        matrix[a][b] = in.nextInt();

    int transpose[][] = new int[n][m];

    for (a = 0; a < m; a++)
      for (b = 0; b < n; b++)
        transpose[b][a] = matrix[a][b];

    System.out.println("Transpose of the matrix:");

    for (a = 0; a < n; a++)
    {
      for (b = 0; b < m; b++)
        System.out.print(transpose[a][b]+"\t");

      System.out.print("\n");
    }
  }
}
