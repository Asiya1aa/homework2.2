package com.company;

public class Main {

    public static void main(String[] args) {
	Printtable[] animal={kriateobjects("Fox"),kriateobjects("Wolf"),kriateobjects("Lion")};
        for (Printtable printtable : animal) {
            printtable.print();

        }
    }
    public static Printtable kriateobjects(String Animal){
       Printtable printtable=null;
       switch (Animal){
           case "Fox":
               printtable = new Fox(4, "black");
               break;
           case "Wolf":
               printtable =new Wolf(4, "Amir");
               break;
           case "Lion":
               printtable =new Lion(4,2);
               break;
       }return printtable;
    }
}
