package de.shingiro.bookstore;

/**
 * Servive für den BookStore
 * 
 * @author angedesires
 *
 */
public interface BookStoreService {
	
	public void erstelleBuch(Book book);
	
	public Book leseBuch(Long bookId);

}
