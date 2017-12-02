/**
 * 
 */
package de.shingiro.bookstore;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author angedesires
 *
 */
public class CD {
	
	@NotNull @Size(min = 4, max = 50)
	private String title;
	
	@NotNull
	private Float price;
	
	// @NotNull(groups = PrintingCatalog.class)
	
	// @Size(min = 100, max = 5000, groups = PrintingCatalog.class)
	private String description;
	
	@Pattern(regexp = "[A-Z][a,z]{1,}")
	private String musicCompany;
	
	@Max(value = 5)
	private Integer numberOfCDs;
	
	private Float totalDuration;
	
	public CD(String title, float price) {
		this.title = title;
		this.price = price;
	}

	@NotNull @DecimalMin("5.8")
	public Float calculatePrice(@DecimalMin("1.4") float rate) {
		return price * rate;
	}
	
	@DecimalMin("9.99")
	public Float calculateVAT() {
		return price * 0.196f;
	}

}
