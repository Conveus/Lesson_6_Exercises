public class PersonCreator {
    public static void main(String[] args) {

        // Create people
        Person person01 = new Person("James Peterson", 34, 180, 73.5f);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2f);

        // Print properties/info
        System.out.printf("%s is %d years old, %f cm tall, and %f ldb %n",
                person01.getName(), person01.getAge(), person01.getHeight(), person01.getWeight());
        System.out.printf("%s is %d years old, %f cm tall, and %f ldb %n",
                person02.getName(), person02.getAge(), person02.getHeight(), person02.getWeight());

        // Call growOlder
        person01.growOlder();
        System.out.printf("%s is %d years old, %f cm tall, and %f ldb %n",
                person01.getName(), person01.getAge(), person01.getHeight(), person01.getWeight());
    }
}
