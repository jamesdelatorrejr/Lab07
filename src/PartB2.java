public class PartB2
{
    public static void main(String[] args)
    {
        for (int row = 5; row > 0; row--)
        {
            for (int col = 5; col > 0; col--)
            {
                if (row >= col)
                {
                    System.out.printf("*");
                }
            }
            System.out.println("");
        }
    }
}