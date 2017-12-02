/**
 * 
 */
package de.shingiro.bookstore;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author a.shingiro
 *
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
// @Target({FIELD, TYPE, METHOD})
public @interface EightDigits {

}
