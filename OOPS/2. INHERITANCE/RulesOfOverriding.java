//1. We can't reduce the visibility of any inherited method. we can increase(private --> default --> protected --> public) the visibility if we want but can't decrease(public --> protected --> default--> p) the visibility. 

// 2. Can't change the return type. If the return type of the method present in parent class is void then we can't make it anything else(int/float/double) during overriding.

// 3. We can't change the parameters of the method. If we change the parameters of the method then it will be considered as specialized method and the concept of Method Overloading will come to the picture.



class Human{

    public void sleep(){
        System.out.println("Human needs to sleep");
    }
}

class Student extends Human{

    //void sleep(){ // Cannot reduce the visibility of the method (In parent class access specifier is public here we are making it to default that leads to decrease the visibility of the method that's why it's throughing the ERROR)
//
    //}

    // public int sleep(){  // --> Return type is incompatible with Human class.

    // }

    public void sleep(int a){  // If you are thinking why it's not throughing any Error after changing the parameters because now it's not the sleep() of the parent class. Now, It's an specialized method.
        System.out.println("Msg");
    }


}



public class RulesOfOverriding {
    public static void main(String[] args) {
        
    }
}