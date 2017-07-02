/**
 * 
 */
package de.shingiro.bookstore;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author a.shingiro
 *
 */
public class BookService {
	
	@Inject @NumberOfDigits(value = Digits.THIRTEEN, odd = false)
	private NumberGenerator numberGenerator;
	
	@Inject
	private EntityManager entityManager;
	
	private Date instanciationDate;
	
	@PostConstruct
	private void initDate() {
		instanciationDate = new Date();
	}
	
	@Transactional
	public Book createBook( String title, Float price, String description ) {
		Book book = new Book();
		book.setIsbn( numberGenerator.generateNumber() );
		book.setInstantiationDate( instanciationDate );
		
		entityManager.persist( book );
		
		return book;
	}
	
}
