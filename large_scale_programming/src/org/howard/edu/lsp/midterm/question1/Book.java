package org.howard.edu.lsp.midterm.question1;

//1. Creating class Book
public class Book {
	//initialized private variables
	private String title;
	private String author;
	private String iSBN;
	private int yearPublished;
	
	//constructor
	public Book(String t, String a, String i, int yP) {
		title = t;
		author = a;
		iSBN = i;
		yearPublished = yP;
	}
	//Get and Set Methods
	public String getTitle() {
		return title;
	}
	
	//sets title
	public void setTitle(String t) {
		title = t;
	}
	
	//gets author
	public String getAuthor() {
		return author;
	}
	// sets author
	public void setAuthor(String a) {
		author = a;
	}
	//gets ISBN
	public String getISBN() {
		return iSBN;
	}
	//sets
	public void setISBN(String i) {
		iSBN = i;
	}
	
	//gets year published
	public int getYearPublished() {
		return yearPublished;
	}
	
	//sets year published
	public void setYearPublished(int yP) {
		yearPublished = yP;
	}
	
	
	//2. Override equals method
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return iSBN.equals(book.iSBN) && author.equals(book.author);
    }
	
	//3. Override toString method
	@Override
	public String toString() {
        return "Title: " + title + ", Author: " + author + 
               ", ISBN: " + iSBN + ", Year Published: " + yearPublished;
    }
}

//https://www.w3schools.com/java/ref_string_tostring.asp

