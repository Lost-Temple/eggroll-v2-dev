/*
 * Copyright 2019 The Eggroll Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.eggroll.rollsite.service;


import com.webank.eggroll.rollsite.core.BasicMeta;
import com.webank.eggroll.rollsite.networking.proxy.Proxy;

public interface FdnRouter {
    BasicMeta.Endpoint route(Proxy.Topic topic);

    void setRouteTable(String filename);

    void initRouteTableFile(String filename);

    void updateRouteTable(String filename, String partId, String ip, int port);

    boolean isAllowed(Proxy.Topic from, Proxy.Topic to);

    boolean isIntranet(BasicMeta.Endpoint endpoint);
}
