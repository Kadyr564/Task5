package com.company;

import java.util.Scanner;

public class Console {
    public static void play() throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите дерево в скобочной нотации");
    System.out.println("Например, можно скопировать это: 15 (40 (6 (1), 30), 1 (, 9 (20, 70)))");
    System.out.print("Строка ввода: ");

    String notationTree = sc.nextLine();
    System.out.println ("Вы ввели дерево: " + notationTree);

    System.out.println("");
    Tree.findMinElement(notationTree);
    System.out.println("");

    System.exit(0);

    }
}
