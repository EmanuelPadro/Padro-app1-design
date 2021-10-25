package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.ArrayList;
import java.util.List;

public class Database {
    static ArrayList<String> title = new ArrayList<>();

    private Database(){}

    static class Tasks{
        //get the index of the list created and apply it to the tasks
        //Each task shall have a due date and a description and be assigned the ID
        //of the given list, thus all tasks and list share an ID that can be called
        public static List<String> getDescription(){
            return new ArrayList<>();//return description
        }
        public static List<String> getDueDate(){
            return new ArrayList<>();//return due date
        }
        private Tasks (){}
    }
    public static List<String> getTitles(){
        return title;
    }
}
