/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.calcite.sql.validate;

/**
 * Abstract base class for implementing {@link SqlConformance}.
 *
 * <p>Every method in {@code SqlConformance} is implemented,
 * and behaves the same as in {@link SqlConformanceEnum#DEFAULT}.
 */
public abstract class SqlAbstractConformance implements SqlConformance {
  public boolean isSortByOrdinal() {
    return SqlConformanceEnum.DEFAULT.isSortByOrdinal();
  }

  public boolean isSortByAlias() {
    return SqlConformanceEnum.DEFAULT.isSortByAlias();
  }

  public boolean isSortByAliasObscures() {
    return SqlConformanceEnum.DEFAULT.isSortByAliasObscures();
  }

  public boolean isFromRequired() {
    return SqlConformanceEnum.DEFAULT.isFromRequired();
  }

  public boolean isBangEqualAllowed() {
    return SqlConformanceEnum.DEFAULT.isBangEqualAllowed();
  }
}

// End SqlAbstractConformance.java
