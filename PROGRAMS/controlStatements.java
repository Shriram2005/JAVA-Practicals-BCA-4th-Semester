// Program to implement various control statement in java i.e. if, if-else, for, while, and switch

class controlStatements {

    public static void main(String[] args) {
        
        // if statement
        int a = 5;
        if (a == 5) {
            System.out.println("It is 5");
        }
        
        // if..else statement
        if (a == 5)
            System.out.println("It is 5");
        else
            System.out.println("It is not 5");

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }

        // while loop
        int b=1;
        while(b<=5){
            System.out.printf("%d ",a);
            b++;
        }

        // switch case
        int c=3;
        switch(c){
            case 1: System.out.println("\nIt is 1");
                    break;
            case 2: System.out.println("\nIt is 2");
                    break;
            case 3: System.out.println("\nIt is 3");
                    break;
            default : System.out.println("\nnot available");
        }

    }
}
