

import java.util.Scanner;

          void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your number: ");
            int num= sc.nextInt();
            sc.close();
            System.out.printf("Factors of %d are:",num);
            for (int i=1; i<=num;i+=1)
            {
                if (num%i ==0) System.out.printf("%d ",i);

            }}





