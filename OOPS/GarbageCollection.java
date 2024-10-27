// In java we can not delete unused object manually but what we can  do is to ask java do anything we want when the object is destroyed that can be done by finalize() method.

class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}
public class GarbageCollection {
    public static void main(String[] args) {
        Demo obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new Demo();
            // Here we are creating multiple objects with the same reference but we know in java one object can't point to multiple objects so objects will be unused then garbage collector will dlt the objects .
        }
    }
}