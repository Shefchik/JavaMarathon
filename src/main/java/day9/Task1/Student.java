package day9.Task1;

public class Student extends Human{

    private final String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;

    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Этот студент с именем "  + this.getName();
    }
}
