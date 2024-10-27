package INHERITANCE;

public class MultiLevel {
    public static void main(String[] args) {

    }
}

class Box {

    int l, h, w;

    public Box() {
        System.out.println("Default/zero parameterized Constructor of Parent class");
    }

    public Box(int l, int h, int w) {
        System.out.println("Parent class constructor is called with 3 arguments l,h,w");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        System.out.println("Parent class constructor of Class type is called");
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}

class BoxWeight extends Box {
    int weight;

    public BoxWeight() {
        System.out.println("zero parameterized Child class constructor is called");

    }

    public BoxWeight(int l, int h, int w, int weight) {
        super(l, h, w); // If we don't invoke any super class' constructor then it will invoke the
                        // default/zero parameterized constructor of the parent class.
        // In this case if we don't write super(a,b,c) then it will invoke the super();
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
}

class BoxPrice extends BoxWeight {
    int cost;

    public BoxPrice(int l, int h, int w, int weight, int cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(BoxWeight other, int cost) {
        super(other);
        this.cost = cost;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

}