/**
 * 
 */
package de.shingiro.bookstore;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * @author a.shingiro
 *
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
// @Target({FIELD, TYPE, METHOD})
public @interface ThirteenDigits {}
