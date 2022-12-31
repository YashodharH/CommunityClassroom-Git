package com.utube;


import java.util.Scanner;

 interface Calculator {
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);

}

class calImp implements Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

}
class Main{
    public static void main(String[] args) {

        Calculator c =new calImp();
        System.out.println("Hi iam a calcultor");
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("enter ur choice");
            System.out.println("1.add \n2.sub\n3.mul\n4.div\n5.exit");
            int choice=s.nextInt();
            int a=0;
            int b=0;
            if(choice>=1 && choice<=4) {
                System.out.println("Enter a and b values");
                a =s.nextInt();
                b =s.nextInt();
            }
            switch(choice) {
                case 1:System.out.println("Add of "+a+"+"+b+"="+c.add(a, b));
                    break;
                case 2:System.out.println("sub of "+a+"-"+b+"="+c.add(a, b));
                    break;
                case 3:System.out.println("mul of "+a+"*"+b+"="+c.add(a, b));
                    break;
                case 4:System.out.println("div of "+a+"/"+b+"="+c.add(a, b));
                    break;

                default: System.out.println("Bye");
                    System.exit(0);


            }
        }
    }
}


