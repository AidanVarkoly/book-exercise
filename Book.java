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
    private int borrow;
    private String number;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        number = "";
        courseText = course;
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
    
    public int getBorrowed()
    {
     return borrow;   
    }    
    
    public boolean isCourseText()
    {
     return courseText;   
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
    
    public void borrow()
    {
     borrow = borrow + 1;   
    }
    public void setRefNumber(String ref)
    {
     if(ref.length()>3){
       number=ref;
    }
     else
    {
     System.out.print("Please make sure that the Ref number is greater than 3 characters");   
    }    
    }
    
    public void printDetails()
    {
        System.out.print("Title: "+ title + "Author: "+ author + 
        "Pages: " + pages + "Refrence Number: " +number + "Times Borrowed: " + borrow + "Course Text: " + courseText);
    }
}    