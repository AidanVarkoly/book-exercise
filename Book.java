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

    public String getAuthor()
    {
       return author;
    } // end of Author
    
    public String getTitle()
    {
       return title;
    } //end of Title
    
    public String getRefNumber()
    {
        return number;
    } //end of Number
    
    public int getBorrowed()
    {
     return borrow;   
    } //end of Borrow   
    
    public boolean isCourseText()
    {
     return courseText;   
    } //end of courseText   
    
    public void printAuthor()
    {
        System.out.print(author);
    } //end of Print Author  
    
    public void printTitle()
    {
        System.out.print(title);
    } //end of Print Title
    
    public int getPages()
    {
        return pages;
    } //end of Pages   
    
    public void length()
    {
     if (number == "")
       number = "ZZZ";  
    } //end of length   
    
    public void borrow()
    {
     borrow = borrow + 1;   
    } //end of Borrow
    
    public void setRefNumber(String ref)
    {
     if(ref.length()>3){
       number=ref;
    }
     else
    {
     System.out.print("Please make sure that the Ref number is greater than 3 characters");   
    }    
    } //end of SetRef
    
    public void printDetails()
    {
        System.out.print("Title: "+ title + "Author: "+ author + 
        "Pages: " + pages + "Refrence Number: " +number + "Times Borrowed: " + borrow + "Course Text: " + courseText);
    } //end of Print Details
}    