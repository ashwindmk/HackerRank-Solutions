import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BotSavesPrincess
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        char grid[][] = new char[m][m];
        for(int i = 0; i < m; i++)
        {
            String line = br.readLine();
            grid[i] = (line.trim()).toCharArray();
        }

        displayPathtoPrincess(m, grid);
    }

    static void displayPathtoPrincess(int m, char[][] grid)
    {
        int botRow = 0, botCol = 0, princessRow = 0, princessCol = 0;

        // Get bot and princess coordinates
        for (int r = 0; r < m; r++)
        {
            for (int c = 0; c < grid.length; c++)
            {
                if (grid[r][c] == 'm' || grid[r][c] == 'M')
                {
                    botRow = r;
                    botCol = c;
                }
                else if (grid[r][c] == 'p' || grid[r][c] == 'P')
                {
                    princessRow = r;
                    princessCol = c;
                }
            }
        }

        // Move the bot up or down till bot reaches same row as princess
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

        // Move the bot left or right till bot reaches same column as princess
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
