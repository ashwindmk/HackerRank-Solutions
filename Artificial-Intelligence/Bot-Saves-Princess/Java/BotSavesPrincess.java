import java.util.Scanner;

/**
 * Created by ashwin on 10/1/17.
 */
public class BotSavesPrincess
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();

        String grid[][] = new String[m][m];
        for(int i = 0; i < m; i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j] = in.next();
            }
        }

        displayPathtoPrincess(m, grid);
    }

    static void displayPathtoPrincess(int m, String[][] grid)
    {
        int botRow = 0, botCol = 0, princessRow = 0, princessCol = 0;

        // Get bot coordinates
        for (int r = 0; r < m; r++)
        {
            for (int c = 0; c < grid.length; c++)
            {
                if (grid[r][c].equalsIgnoreCase("m"))
                {
                    botRow = r;
                    botCol = c;
                }
            }
        }

        // Get princess coordinates
        for (int r = 0; r < m; r++)
        {
            for (int c = 0; c < grid.length; c++)
            {
                if (grid[r][c].equalsIgnoreCase("P"))
                {
                    princessRow = r;
                    princessCol = c;
                }
            }
        }

        // Move the bot up or down till bot reaches same row
        if( princessRow < botRow )
        {
            while(botRow != princessRow)
            {
                botRow--;
                System.out.println("UP");
            }
        }
        else if( princessRow > botRow )
        {
            while(botRow != princessRow)
            {
                botRow++;
                System.out.println("DOWN");
            }
        }

        // Move the bot left or right till bot reaches same column
        if( princessCol < botCol )
        {
            while(botCol != princessCol)
            {
                botCol--;
                System.out.println("LEFT");
            }
        }
        else if( princessCol > botCol )
        {
            while(botCol != princessCol)
            {
                botCol++;
                System.out.println("RIGHT");
            }
        }

    }
}
