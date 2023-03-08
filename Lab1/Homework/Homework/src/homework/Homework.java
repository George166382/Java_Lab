/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package homework;

/**
 *
 * @author G
 */
public class Homework {

    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Numar insuficient de argumente");
            System.exit(-1);
        }
        if(args[0].contains("."))
        {
            System.out.println("Trebuie integer");
            System.exit(-1);
        }
        int numar = Integer.parseInt(args[0]);
        System.out.println(numar);
        if(numar > 30000)
        {
          
            System.out.print(System.currentTimeMillis());
        }
        else
        {
            int[][] matrix = new int[numar][numar];
            //String s = new String();
            for(int i=0 ; i<numar ; i++)
            {
                String s = new String();
                matrix[i][0] = i + 1; 
                s = s + matrix[i][0];
                for(int j=1; j<numar ; j++)
                {
                    if(matrix[i][j-1]==numar)
                    {
                        matrix[i][j] = 1;
                    }
                    else
                    {
                        matrix[i][j] = matrix[i][j-1] + 1;
                    }
                    s = s + matrix[i][j];
                }
                 System.out.print(s);
                System.out.print("\n");
            }
        }
        
    }
}
