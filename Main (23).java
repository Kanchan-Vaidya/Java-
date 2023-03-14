class Array Demo 
{
    public static void main (string[] args)
    {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12}
        };
        System.out.println("\n The matrix is :");
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println(""+matrix[i][j]);
            }
            System.out.println();
        }
    }
}