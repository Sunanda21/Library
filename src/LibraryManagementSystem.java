import java.util.Scanner;


class library{
    String[] books ;
    int no_of_book ;

     library(){
         this.books = new String[100] ;
         this.no_of_book = 0;
    }
    void AddBooks(String name){
         this.books[no_of_book] = name;
         no_of_book++;
        System.out.println(name+ " has been added successfully.");
     }
     void AvailableBook(){
         System.out.println("Available books are.");
         for(int i=0; i< books.length;i++)
         {
             if(books[i]== null)
                continue;
             else
                System.out.println("*" + books[i]);
         }
     }
     void issueBook(String n){
         for(int i=0; i<this.books.length;i++)
         {    int count =0;
             if (this.books[i].equals(n))
             {
                 System.out.println("Book has been issued successfully!!!!");
                 this.books[i] = null ;
                 return;
             }
         }
         System.out.println("book doesn't exist.");

     }
     void returnBook(String b){
         this.books[no_of_book] = b;
         System.out.println("Book returned successfully!!!!");
     }



}



public class LibraryManagementSystem {
    public static void main (String[] args) {

        System.out.println("**********WELCOME TO ONLINE LIBRARY MANAGEMENT SYSTEM************");
        System.out.println("Enter your choice.");
        System.out.println("1. ADD BOOK. ");
        System.out.println("2. ISSUE BOOK. ");
        System.out.println("3. RETURN BOOK. ");
        System.out.println("4. AVAILABLE BOOKS. ");
        System.out.println("5. EXIT. ");
        System.out.println(" SYNTAX: NO. _ NAME");


        library bookBank = new library();
        Scanner sc = new Scanner(System.in);


        while(true){
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    String name1 = sc.nextLine();
                    bookBank.AddBooks(name1);
                    break;
                case 2:

                    String name2 = sc.nextLine();
                    bookBank.issueBook(name2);
                    break;
                case 3:

                    String name3 = sc.nextLine();
                    bookBank.returnBook(name3);
                    break;
                case 4:
                    bookBank.AvailableBook();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid input!!");

            }

        }


    }
}
