package week5.collections_oefeningen;

import java.util.ArrayList;

public class Studentenlijst {


    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jan Peeters");
        studentList.add("Jan Peeters");
        studentList.add("John Smith");
        studentList.add("diana hoe");
        studentList.add("janet seiler");
        studentList.add("imran vladimir");
        studentList.add("jack deleclairmant");
        studentList.add("imran vladimir");
        formatStudentList(studentList);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        findStudentIndices(studentList, "janet seiler");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        removeDuplicates(studentList);


    }

    static ArrayList<String> formatStudentList(ArrayList<String> studentList) {
        ArrayList<String> formatted = new ArrayList<>();
        int index = 0;
        for (String student : studentList) {
            index++;
            String[] first = student.split(" ");
            String formattedLine = index + ": " + first[1].toUpperCase() + " " + first[0];
            System.out.println(formattedLine);
            formatted.add(formattedLine);
        }
        return formatted;
    }

    static ArrayList<Integer> findStudentIndices(ArrayList<String> studentList, String nameToFind) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equals(nameToFind)) {
                indices.add(i);
                System.out.println(i);
            }
        }
        return indices;
    }

    static ArrayList<String> removeDuplicates(ArrayList<String> studentList) {
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String student : studentList) {
            if (!uniqueList.contains(student)) {
                uniqueList.add(student);
                System.out.println(student);
            }
        }
        return uniqueList;
    }
}
