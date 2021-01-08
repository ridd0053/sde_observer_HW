package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        HashMap<String, Student> students = getStudents();

        Student marie = students.get("marie");
        teacher.subscribe(marie);

        // ugly way to show
        // the power of Observer

        // use:
        // add <studentname>
        // remove <studentname>

        while(true) {

            teacher.Teach();

            String input = Console.readLine();

            String command = Console.getWords(input)[0];

            if (command.equals("add")) {

                String name = Console.getWords(input)[1];
                Student student = students.get(name);
                teacher.subscribe(student);
            }

            if (command.equals("remove")) {

                String name = Console.getWords(input)[1];
                Student student = students.get(name);
                teacher.unsubscribe(student);
            }
        }
    }

    private static HashMap<String, Student> getStudents(){

        HashMap<String, Student> students = new HashMap<>();

        students.put("marie", new Marie());
        students.put("kees", new Kees());
        students.put("me", new Me());

        return students;
    }

}