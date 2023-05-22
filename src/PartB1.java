public class PartB1
{
    public static void main(String[] args)
    {
        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
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