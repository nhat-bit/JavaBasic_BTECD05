
package Project.models;

import java.util.Scanner;
public class Book {
    private int id;
    private String name;
    private String author;
    private String language;
    private String price;
    private String pulishdate;
 
    private String ISBN;
    
    public Book(){
    
}
    public Book(int id, String name, String author, String language, String price,String pulishdate, String ISBN){
        this.id = id;
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
        this.pulishdate = pulishdate;
        this.ISBN = ISBN;
     
    }

    public Book input(Scanner sc) {

        System.out.println("Enter book id: ");
        int id = sc.nextInt();
        sc.nextLine(); // ignore new line

        System.out.println("Enter full name: ");
        String name = sc.nextLine();

        System.out.println("Enter author: ");
        String author = sc.nextLine();

        System.out.println("Enter language: ");
        String language = sc.nextLine();
        
        String price = sc.nextLine();
        System.out.println("Enter price: ");
        sc.nextLine();
        
        System.out.println("Enter pulishdate: ");
        String publishdate = sc.nextLine();
        
        System.out.println("Enter ISBN: ");
        String ISBN = sc.nextLine();
        sc.nextLine();

        return new Book(id, name, author, language,price,publishdate,ISBN );
    }

    public void edit(Scanner sc) {
        System.out.println("Enter new name: ");
        this.name = sc.nextLine();

        System.out.println("Enter new author: ");
        this.author = sc.nextLine();

        System.out.println("Enter new language: ");
        this.language = sc.nextLine();
        
        System.out.println("Enter new price: ");
        String price = sc.nextLine();
      
        System.out.println("Enter new pulishdate: ");
       String publishdate = sc.nextLine();
        
        System.out.println("Enter new ISBN: ");
        String ISBN = sc.nextLine();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String  getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPulishdate() {
        return pulishdate;
    }

    public void setPulishdate(String pulishdate) {
        this.pulishdate = pulishdate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void display() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return id +  ", " + name + ", " + author + ", " + language + "," + price + ","+ pulishdate+"," + ISBN ;
    }


    
}
