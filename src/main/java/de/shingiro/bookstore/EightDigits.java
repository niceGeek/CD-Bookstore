/**
 * 
 */
package de.shingiro.bookstore;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

/**
 * @author a.shingiro
 *
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
public @interface EightDigits {

}
