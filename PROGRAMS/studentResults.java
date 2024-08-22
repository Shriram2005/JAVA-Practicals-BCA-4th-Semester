// Program for calculating result of a student which includes total marks, percentage.


import java.util.Scanner;

class studentResults {

    public static void main(String[] args) {
        int average, total, percentage;
        int eng, maths, sci, bio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in English : ");
        eng = sc.nextInt();
        System.out.print("Enter marks in Maths : ");
        maths = sc.nextInt();
        System.out.print("Enter marks in Science : ");
        sci = sc.nextInt();
        System.out.print("Enter marks in Biology : ");
        bio = sc.nextInt();

        total = eng + maths + sci + bio;
        System.out.println("\nTotal Marks are : " + total);
        average = total / 4;
        System.out.println("Average of Total marks are : " + average);
        percentage = (total / 400) * 100;
        System.out.println("Percentage of Total marks are : " + percentage);

        // finding grade

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("Grade B");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade C");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade D");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade E");
        } else {
            System.out.println("Chala ja bhosdike Fail Hogaya Tu");
        }

        sc.close();

    }

}