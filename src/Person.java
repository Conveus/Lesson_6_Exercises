public class Person {

    // Create variables
    private String name;
    private int age;
    private float height;
    private float weight;

    // Create constructor
    public Person(String name, int age, float height, float weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    // Create getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Increase age and decrease height + weight
    void growOlder(){
        age++;
        height--;
        weight -= 0.5f;
    }
}
