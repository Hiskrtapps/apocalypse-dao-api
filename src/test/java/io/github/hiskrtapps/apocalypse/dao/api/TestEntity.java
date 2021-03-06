/*
 * © 2020 Ceppi Productions.
 */
package io.github.hiskrtapps.apocalypse.dao.api;

import java.util.Arrays;
import java.util.Date;

public abstract class TestEntity implements Entity, Cloneable {

  /**
   * @param date date to be cloned
   * @return cloned Date
   */
  protected final Date clone(final Date date) {
    return date == null ? null : new Date(date.getTime());
  }

  /**
   * @param originalData byte array to be cloned
   * @return cloned byte array
   */
  protected final byte[] clone(final byte[] originalData) {
    return originalData == null ? null : Arrays.copyOf(originalData, originalData.length);
  }

}