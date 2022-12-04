package org.example;

public class ForWhilePlayground {

    public void findMaxGrade() {
        int[] grades = {-6, 8, 7, 9};

        // FOR Loop Examples!!!

//        boolean foundNegatives=false;
//        for (int i=0; i< grades.length; i++) {
//            if (grades[i] < 0) {
//                System.out.println(grades[i] + " einai arnhtikos");
//                foundNegatives = true;
//            }
//        }
//
//        if (foundNegatives){
//            return;
//        }
//
//
//        int sum=0;
//        for (int i=0; i< grades.length; i++) {
//            sum= sum+grades[i];
//        }
//        System.out.println("to sum twn elements tou pinaka einai :" +sum);
//
//        int multi=1;
//        for (int i=0; i< grades.length; i++) {
//            multi = multi * grades[i];
//        }
//        System.out.println("to ginomeno ton elements tou pinak einai :" + multi);
//
//        int sum5=0;
//        for (int i=1; i<=5; i++) {
//            sum5 = sum5 + i;
//        }
//        System.out.println("to sum mexri to 5 einai :" + sum5);
//
//        for (int i=1; i<=5; i++) {
//            System.out.println(i);
//        }
//
//        int max=0;
//        for (int i=0; i< grades.length; i++) {
//            if (grades[i]>max){
//                max=grades[i];
//            }
//        }
//        System.out.println("to max einai :" + max);
//
//        int min=grades[0];
//        for (int i=0; i< grades.length; i++) {
//            if (grades[i]<min){
//                min=grades[i];
//            }
//        }
//        System.out.println("to min einai :" + min);


//        int count=0;
//        for (int i=0; i < grades.length; i++) {
//            if (grades[i] >= 5) {
//                count=count+1;
//            }
//        }
//        System.out.println(count);


//        WHILE Loop examples!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }


//        int i=0;
//        while (i < grades.length) {
//            System.out.println(grades[i]);
//            i++;
////        }

//
//        int count=0;
//        int i=0;
//        while(i< grades.length) {
//            if (grades[i] >=5) {
//                count = count + 1;
//            }
//            i++;
//        }
//        System.out.println(count);

//        int i=0;
//        while (i< grades.length) {
//            if (grades[i]<0) {
//                System.out.println(grades[i] + "den einai egkiros");
//            }
//            if (grades[i]>10) {
//                System.out.println(grades[i] + "den einai egkiros");
//            }
//            i++;
//        }

//        int i=0;
//        while (i< grades.length) {
//            if (grades[i]<0 || grades[i]>10) {
//                System.out.println(grades[i] + "den einai egkiros");
//            }
//            i++;
//       }
//        int max=0;
//        for (int i=0; i< grades.length; i++) {
//            if (grades[i]>max){
//                max=grades[i];
//            }
//        }
//        System.out.println("to max einai :" + max);


        // elegxei an oi times einai metaksi toy 0 kai toy 20
        boolean falseNumber= false;
        int i=0;
        while (i< grades.length) {
            if (grades[i]<0 || grades[i]>20) {
                falseNumber= true;
            }
            i++;
        }
        if (falseNumber){
            System.out.println("mi egkiros arithmos");
        }




    }
}
