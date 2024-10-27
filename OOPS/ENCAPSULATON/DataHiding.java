class Student{
    private int age;
    private String name;

     void showData(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
    void setValue(int age, String name){
            this.age = age;
            this.name = name;
    }
    int getvalue1(){
        return age;
    }
    String getvalue2(){
        return name;
    }

}

public class DataHiding {
    public static void main(String[] args) {
        
        Student obj = new Student();
        //System.out.println("Age: "+obj.age); -->  Not visible as it's private(Data Hiding)
        obj.showData();
        //obj.age = 18; --> Not Possible then how can I set the value
        obj.setValue(28, "Debasis");
        obj.showData();
        System.out.println(obj.getvalue1());
        System.out.println(obj.getvalue2());

        // Next we will make the program a bit more clean and concise in the setter and getter file of the respective folder
    }
}