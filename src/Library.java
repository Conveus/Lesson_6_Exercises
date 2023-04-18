public class Library {
    public static void main(String[] args) {

        // Create authors
        Author chris = new Author("Christopher Paolini","cPaolini@email.com",'m');
        Author derek = new Author("Derek Landy","dLandy@email.co.uk",'m');
        Author mike = new Author("Michael Scott","mScott@email.co.uk",'m');

        // Create books;
        Book b1 = new Book("Eragon", chris, 25, 8);
        Book b2 = new Book("Eldest", chris, 25, 15);
        Book b3 = new Book("Brisingr", chris, 25, 12);
        Book b4 = new Book("Inheritance", chris, 25, 10);
        Book b5 = new Book("Skullduggery Pleasant", derek, 25, 5);
        Book b6 = new Book("The Alchemist", mike, 25);

        // Print book info
        System.out.println(b1.toString());
        System.out.println(b5.toString());
        System.out.println(b6.toString());

    }
}
