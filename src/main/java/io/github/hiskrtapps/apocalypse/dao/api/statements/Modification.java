/*
 * © 2020 Ceppi Productions.
 */
package io.github.hiskrtapps.apocalypse.dao.api.statements;

import java.util.Map;

/**
 * Common class for generic modification statements
 *
 */
public interface Modification extends Statement {

  /**
   * return the array of maps of parameters. Each parameter has a name and a value
   *
   * @return Map of parameters
   */
  Map<String, Object>[] valuesMaps();

}