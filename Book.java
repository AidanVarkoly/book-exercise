/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Aidan Varkoly
 * @version 2/4/19
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String number;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        number = "";
    }

    // Add the methods here ...
    public String getAuthor()
    {
       return author;
    }
    
    public String getTitle()
    {
       return title;
    }
    
    public String getRefNumber()
    {
        return number;
    }
    public void printAuthor()
    {
        System.out.print(author);
    }   
    
    public void printTitle()
    {
        System.out.print(title);
    }
    
    public int getPages()
    {
        return pages;
    }    
    
    public void length()
    {
     if (number == "")
       number = "ZZZ";  
    }    
        public void setRefNumber(String ref)
    {
        System.out.print(number);   
    }
    
    public void printDetails()
    {
        System.out.print("Title: "+ title + "Author: "+ author + 
        "Pages: " + pages + "Refrence Number: " +number);
    }    
} 
    