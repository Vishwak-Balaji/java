import java.io.*;

public class Serialization {
    public static void main(String[] args) throws Exception{
        //data transfer
        //to transfer data in more efficient manner
        //it converts the objects into stream(sequence of data)

        Student s = new Student();
        FileOutputStream f = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(f);
        oos.writeObject(s);

        FileInputStream f1 = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(f1);
        Student obj = (Student)ois.readObject();

        System.out.println(obj.name);
        System.out.println(obj.id);
    }
}
class Student implements Serializable{
    String name = "user";
    int id = 1234;
}
  