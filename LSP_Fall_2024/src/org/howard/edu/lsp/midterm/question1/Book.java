package org.howard.edu.lsp.midterm.question1;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 * The Book class represents a book in a library with encapsulated attributes.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor to initialize a Book object.
     * 
     * @param title          the title of the book
     * @param author         the author of the book
     * @param ISBN           the ISBN number of the book (a unique identifier)
     * @param yearPublished  the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getter methods

    /**
     * Gets the title of the book.
     * 
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN number of the book.
     * 
     * @return the ISBN number of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the year the book was published.
     * 
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter methods

    /**
     * Sets the title of the book.
     * 
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the ISBN of the book.
     * 
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Sets the year the book was published.
     * 
     * @param yearPublished the year to set
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Override equals method to compare books by ISBN and author
    /**
     * Overrides the equals method to compare two books based on ISBN and author.
     * 
     * @param obj the other object to compare to
     * @return true if both books have the same ISBN and author, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    // Override toString method to provide a meaningful string representation
    /**
     * Overrides the toString method to return a string representation of the book.
     * 
     * @return a string representation of the book with its title, author, ISBN, and year published
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
