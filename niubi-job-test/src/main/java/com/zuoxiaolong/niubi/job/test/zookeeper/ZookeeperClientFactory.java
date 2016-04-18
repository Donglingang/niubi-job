/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.niubi.job.test.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @author Xiaolong Zuo
 * @since 0.9.4.2
 */
public interface ZookeeperClientFactory {

    static CuratorFramework getClient() {
        CuratorFramework client = CuratorFrameworkFactory.newClient("localhost:2181,localhost:3181,localhost:4181", new ExponentialBackoffRetry(1000, Integer.MAX_VALUE));
        client.start();
        return client;
    }

}
