/*
Armenian Dictionary Search using Java
Made by Hagop Ketchedjian
Version 1.1
Original Creation Date: November 2021
Last Update: May 2023
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //System.out.println("Adding words to program...");
        ArmenianDictionary armodict = new ArmenianDictionary();

        System.out.println("\nWelcome to Armenian Dictionary Search.");
        System.out.println("Բարի գալուստ Հայերեն Բառ Փնտռողին:");
        System.out.println("Добро пожаловать в поиск по армянскому словарю․\n");
        System.out.println("Directions:\nTo find a word that starts with a certain letter use - after the letter (Ex. Ա- would give Արարատ). To find a word that ends with a certain letter or phrase use - before the letter (Ex. -ով would give կողով)․ \nEnter \"# of words\" to see how many words this program contains. \nEnter \"Stop\" to stop the program.\n");
        System.out.println("Հրահանգ:\nՈրոշակի տառով սկսվող բառ գտնելու համար օգտագործեք - տառից հետո (Ex. Ա- կտա Արարատ)։ Որոշակի տառով կամ արտահայտությունով ավարտվող բառ գտնելու համար օգտագործեք - տառից առաջ (Ex. -ով կտա կողով)\n");
        System.out.println("инструкции:\nЧтобы найти слово, которое начинается с определенной буквы, используйте - после буквы (Ex. Ա- даст Արարատ). Чтобы найти слово, оканчивающееся на определенную букву или фразу, используйте - перед буквой (Ex. -ով даст կողով)․\n");

        System.out.print("\nEnter Search: ");
        Scanner in = new Scanner (System.in);
        String input = in.nextLine();

        while (!input.equalsIgnoreCase("stop"))
        {
            armodict.getResponse(input);
            System.out.print("\nEnter Search: ");
            input = in.nextLine();
        }
    }
}
