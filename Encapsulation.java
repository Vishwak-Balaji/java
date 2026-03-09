public class Encapsulation {
    public static void main(String[] args) {
        Person obj1 = new Person();

        obj1.setName("Vishwak");
        obj1.setAge(22);
        int resutltAge = obj1.getAge();
        String resultName = obj1.getName();
        System.out.println(resultName +":"+ resutltAge);
    }

}
 class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int  getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge>0 && newAge<=120){
            this.age= newAge;
        }
        else{
            System.out.println("Invalid age. Age must be between 1 and 120.");
        }
    }
}
