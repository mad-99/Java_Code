package secc;
class Student{
private int rollNo =100;
private String name;
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}
public class EncapsulationDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
Student s = new Student();
s.setName("Rahul");
s.setRollNo(123);
System.out.println(s.getName());
System.out.println(s.getRollNo());
}



}

