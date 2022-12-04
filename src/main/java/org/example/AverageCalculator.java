package org.example;

public class AverageCalculator {

    public void calculateAverage() {
        int[] grades = {15, -5, 5, 15};

        // elegxei an uparxoun arnhtikoi

//        boolean foundNegatives=false;
//
//        for (int i=1; i< grades.length; i++) {
//            if (grades[i]<0){
//                foundNegatives = true;
//                System.out.println(grades[i]);
//            }
//
//        }
//        if (foundNegatives) {
//            System.out.println("vrika arnhtikous");
//            return;
//
//        }

//        //ypologizei meso oro
//        int sum=0;
//        for (int i=0; i< grades.length; i++) {
//            sum=sum+grades[i];
//        }
//        int average = sum/ grades.length;
//        System.out.println(average);

        // elegxei an oi times einai metaksi toy 0 kai toy 20
        boolean foundFalseNumbers = false;
        for (int i=0; i< grades.length; i++) {
            if (grades[i]<0 || grades[i]>20) {
                foundFalseNumbers = true;
            }
        }
        if (foundFalseNumbers) {
            System.out.println("Lathos Arithmos");
        }


        //vriskei meso oro vathmon kai an einai >18 typonei arista klp

        int sum=0;
        for (int i=0; i< grades.length; i++) {
            sum=sum+grades[i];
        }
        int average = sum/ grades.length;
        System.out.println(average);

        if (average>=18 && average<=20) {
            System.out.println("Arista");
        }
        if (average<18 && average>=15) {
            System.out.println("kalos");
        }
        if (average<15 && average>=10) {
            System.out.println("metrios");
        }
        if (average<10) {
            System.out.println("kopikate");
        }





    }


}
