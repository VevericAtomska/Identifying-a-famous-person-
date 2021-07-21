package dz06;

import java.util.Scanner;

public class Dz06 {
    
    static void findCelebrity(int n)
    {
        int x;
        int y = 0;
        
        int[][] m = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    m[i][j]= 1;
                }
                else
                {
                    m[i][j] = (int) Math.round(Math.random());
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i = 0; i < n; i++)
        {
            x= 0;
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    continue;
                }
                if(m[i][j] == 0 && m[j][i] == 1)
                {
                    x++;
                }
                else
                {
                    x--;
                }
            }
            if(x == (n-1))
            {
                y = i;
            }
        }
        if(y != 0)
        {
            System.out.println("Osoba pod rednim brojem " + y + " je poznata licnost");
        }
        else
        {
            System.out.println("Medju ovim osobama nema poznate licnosti!");
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Unesite broj osoba: ");
        int n = s.nextInt();
        
        System.out.println("Matrica poznanstava ovih osoba je: ");
        
        findCelebrity(n);
        
    }
    
}

