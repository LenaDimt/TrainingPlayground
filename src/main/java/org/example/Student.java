package org.example;

public class Student {

    String name;

    int age;

    float[] grades;

    boolean vaccinated;

    public void calculateAverage() {
        float sum=0;
        for (int i=0; i< grades.length; i++) {
            sum=sum+grades[i];
        }
        float average = sum/ grades.length;

        if (average>=18 && average<=20) {
            System.out.println(name + ": Arista");
        }
        if (average<18 && average>=15) {
            System.out.println(name + ": kalos");
        }
        if (average<15 && average>=10) {
            System.out.println(name + ": metrios");
        }
        if (average<10) {
            System.out.println(name + ": kopikate");
        }
    }



}
