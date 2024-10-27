import PACKAGE.Demo;

public class Main {
    public static void main(String[] args) {
        // Demo obj1 = new Demo(); // we can't create the object as it can't invoke the
        // constructor as it's private

        SingleToneClass obj1 = SingleToneClass.getInstance();
        SingleToneClass obj2 = SingleToneClass.getInstance();
        SingleToneClass obj3 = SingleToneClass.getInstance();

        // In the above 3 examples different objects are not created actually what's happening it only creates one object then it's referring that same object to others. So, here all the 3 objects(obj1, obj2, obj3) are referring to 1 object.
    }
}
