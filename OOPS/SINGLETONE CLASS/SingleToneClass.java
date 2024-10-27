// If we want only one instance should be created of any class then that class is known as single tone class

// Logically if we don't want to allow multiple instances to be created then we should not allow anyone to call the instructor of the class. because when any constructor is  called new object is getting created so if we provoke others to call the instructor of the class then we can do that

public class SingleToneClass {
    private SingleToneClass() {
        System.out.println("Command in Constructor");
    }

    // I only needs one instance
    private static SingleToneClass obj;

    public static SingleToneClass getInstance() {

        // Check whether only 1 object is created or not? If not then create one and
        // return that otherwise if already created then just return that object.

        if (obj == null) {
            obj = new SingleToneClass(); // constructor can be called here as it in the same class (scope of private)
        }
        return obj;
    }
}