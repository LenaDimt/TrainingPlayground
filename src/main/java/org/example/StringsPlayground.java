package org.example;

public class StringsPlayground {

    public void play() {

//        String name = "nikos";
//
//        String address = "Athens";
//
//        String informations = name.concat(address);



//        boolean athensExists;
//        athensExists = "nikos lives in Athens".contains("Athen1");
//        System.out.println(athensExists);


        // !!! String, Boolean, Contains
//        String names = "nikos, eleni, nik7, el";
//        boolean nikosExist=false;
//        nikosExist= names.contains("nikos");
//        if (nikosExist){
//            System.out.println("o nikos yparxei"); //vriskei an yparxei "nikos" mesa sto string
//        }


//        // !!! String, Array
//        String [] names = {"eleni", "nikos", "roula"};
//
//        for (int i=0; i< names.length; i++) {
//            System.out.println(names[i]);    //typonei ola ta onomata poy exei mesa o pinakas
//        }
//
//        for (int i=0; i< names.length; i++) {
//            System.out.println(names[i] + "!"); //typonei ola ta onomata poy exei mesa o pinakas me ena ! sto telos
//
//        }


        // !!! String, Array, concat
        String [] names = {"eleni", "nikos", "roula"};
        for (int i=0; i< names.length; i++) {
            String nameQuestionMark;
            nameQuestionMark = names[i].concat("!");
            System.out.println(nameQuestionMark) ; //typonei ola ta onomata poy exei mesa o pinakas me ena ! sto telos me to concat

        }

















    }
}
