/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.test.dunit;

import java.net.UnknownHostException;

import com.gemstone.gemfire.internal.SocketCreator;

public class NetworkSupport {
  
  protected NetworkSupport() {
  }

  /** get the IP literal name for the current host, use this instead of  
   * "localhost" to avoid IPv6 name resolution bugs in the JDK/machine config.
   * @return an ip literal, this method honors java.net.preferIPvAddresses
   */
  public static String getIPLiteral() { // TODO: move
    try {
      return SocketCreator.getLocalHost().getHostAddress();
    } catch (UnknownHostException e) {
      throw new Error("problem determining host IP address", e);
    }
  }
}