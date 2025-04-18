/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2015 The ZAP Development Team
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
package org.parosproxy.paros.db;

/**
 * A class representing a generic database server This interface was extracted from the previous
 * Paros class of the same name. The Paros class that implements this interface has been moved to
 * the 'paros' sub package and prefixed with 'Paros'
 *
 * @author psiinon
 */
public interface DatabaseServer {

    /**
     * Gets the URL used to connect to the DB.
     *
     * @return the URL, never {@code null}.
     * @since 2.16.1
     */
    String getUrl();

    /**
     * Gets the user name used to connect to the DB.
     *
     * @return the user name, never {@code null}.
     * @since 2.16.1
     */
    String getUser();

    /**
     * Gets the password of the user.
     *
     * @return the password, might be {@code null}.
     * @since 2.16.1
     */
    String getPassword();
}
