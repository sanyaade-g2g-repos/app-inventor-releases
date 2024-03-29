// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.appinventor.components.runtime.collect;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Provides static methods for creating mutable {@code Maps} instances easily.
 *
 * Note: This was copied from the com.google.android.collect.Maps class
 *
 * @author markf@google.com (Mark Friedman)
 */
public class Maps {
  /**
   * Creates a {@link HashMap} instance.
   *
   * @return a newly-created, initially-empty {@link HashMap}
   */
  public static <K, V> HashMap<K, V> newHashMap() {
    return new HashMap<K, V>();
  }

  /**
   * Creates a {@link TreeMap} instance.
   *
   * @return a newly-created, initially-empty {@link TreeMap}
   */
  public static <K, V> TreeMap<K, V> newTreeMap() {
    return new TreeMap<K, V>();
  }
}
