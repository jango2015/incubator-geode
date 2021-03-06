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
package com.gemstone.gemfire.modules.hibernate;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.cache.QueryCache;
import org.hibernate.cache.QueryCacheFactory;
import org.hibernate.cache.UpdateTimestampsCache;
import org.hibernate.cfg.Settings;

/**
 * Defines a factory for query cache instances. These factories are responsible
 * for creating individual QueryCache instances.
 * 
 */
public class GemFireQueryCacheFactory implements QueryCacheFactory {
  public QueryCache getQueryCache(String regionName,
      UpdateTimestampsCache updateTimestampsCache, Settings settings,
      Properties props) throws HibernateException {
    return new org.hibernate.cache.StandardQueryCache(settings, props,
        updateTimestampsCache, regionName);
  }
}
