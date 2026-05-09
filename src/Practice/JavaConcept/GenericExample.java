package Practice.JavaConcept;

class Dog<T, ABC> {
    T id;
    ABC name;

    public Dog(T id, ABC name) {
        this.id = id;
        this.name = name;
    }

    T getId() {
        return id;
    }

    ABC getName() {
        return name;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("1sfhksfiwfyiw", "Prince");
        Dog d2 = new Dog(1, "ABD");  //Raw use of parameterized class 'Dog if we don't provide Dog<Integer> but it will work

        System.out.println("id: " + d1.getId() + ", name:" + d1.getName());
        System.out.println("id: " + d2.getId() + ", name: " + d2.getName());
    }
}
