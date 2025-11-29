

import java.util.Scanner;

          void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your number: ");
            int num= sc.nextInt();
            sc.close();
            System.out.printf("Factors of %d are:",num);
            IntStream.iterate(1,s->s<=num,s->s+=1).filter(s->num%s ==0).forEach(s->System.out.printf("%d ", s));
        }



