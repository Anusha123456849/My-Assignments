import java.io.*;
import java.util.*;
import java.util.logging.*;

class InvalidStudentException extends Exception {
    InvalidStudentException(String msg) {
        super(msg);
    }
}

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name.trim();
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + "," + name + "," + age;
    }
}

class P5{
    static Logger logger = Logger.getLogger("StudentLog");

    public static void main(String[] args) {

        Set<Student> validStudents = new HashSet<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader("students.txt"));
                BufferedWriter valid = new BufferedWriter(new FileWriter("valid.txt"));
                BufferedWriter invalid = new BufferedWriter(new FileWriter("invalid.txt"))
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                try {
                    String[] arr = line.split(",");

                    int id = Integer.parseInt(arr[0].trim());
                    String name = arr[1].trim();
                    int age = Integer.parseInt(arr[2].trim());

                    if (age < 18)
                        throw new InvalidStudentException("Age < 18");

                    Student s = new Student(id, name, age);
                    validStudents.add(s);

                } catch (Exception e) {
                    invalid.write(line);
                    invalid.newLine();
                    logger.warning("Invalid record: " + line);
                }
            }

            for (Student s : validStudents) {
                valid.write(s.toString());
                valid.newLine();
            }

            logger.info("Processing completed");

        } catch (Exception e) {
            logger.severe(e.getMessage());
        }
    }
}
