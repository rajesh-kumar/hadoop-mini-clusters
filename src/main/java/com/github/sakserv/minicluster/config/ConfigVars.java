/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.sakserv.minicluster.config;

public class ConfigVars {
    
    // Props file
    public static final String DEFAULT_PROPS_FILE = "default.properties";
    
    // Zookeeper
    public static final String ZOOKEEPER_PORT_KEY = "zookeeper.port";
    public static final String ZOOKEEPER_HOST_KEY = "zookeeper.host";
    public static final String ZOOKEEPER_TEMP_DIR_KEY = "zookeeper.temp.dir";
    public static final String ZOOKEEPER_CONNECTION_STRING_KEY = "zookeeper.connection.string";

    // MongoDB
    public static final String MONGO_IP_KEY = "mongo.ip";
    public static final String MONGO_PORT_KEY = "mongo.port";
    public static final String MONGO_DATABASE_NAME_KEY = "mongo.database.name";
    public static final String MONGO_COLLECTION_NAME_KEY = "mongo.collection.name";
    
    // ActiveMQ
    public static final String ACTIVEMQ_HOSTNAME_KEY = "activemq.hostname";
    public static final String ACTIVEMQ_PORT_KEY = "activemq.port";
    public static final String ACTIVEMQ_QUEUE_NAME_KEY = "activemq.queue";
    public static final String ACTIVEMQ_STORE_DIR_KEY = "activemq.store.dir";
    public static final String ACTIVEMQ_URI_PREFIX_KEY = "activemq.uri.prefix";
    public static final String ACTIVEMQ_URI_POSTFIX_KEY = "activemq.uri.postfix";
    
    // Storm
    public static final String STORM_ENABLE_DEBUG_KEY = "storm.enable.debug";
    public static final String STORM_NUM_WORKERS_KEY = "storm.num.workers";
    public static final String STORM_TOPOLOGY_NAME_KEY = "storm.topology.name";
    
    // Hive
    public static final String HIVE_SCRATCH_DIR_KEY = "hive.scratch.dir";
    public static final String HIVE_WAREHOUSE_DIR_KEY = "hive.warehouse.dir";
    
    // Hive Metastore
    public static final String HIVE_METASTORE_HOSTNAME_KEY = "hive.metastore.hostname";
    public static final String HIVE_METASTORE_PORT_KEY = "hive.metastore.port";
    public static final String HIVE_METASTORE_DERBY_DB_DIR_KEY = "hive.metastore.derby.db.dir";
    
    // Hive Server2
    public static final String HIVE_SERVER2_HOSTNAME_KEY = "hive.server2.hostname";
    public static final String HIVE_SERVER2_PORT_KEY = "hive.server2.port";
    
    // Hive Test
    public static final String HIVE_TEST_DATABASE_NAME_KEY = "hive.test.database.name";
    public static final String HIVE_TEST_TABLE_NAME_KEY = "hive.test.table.name";
}