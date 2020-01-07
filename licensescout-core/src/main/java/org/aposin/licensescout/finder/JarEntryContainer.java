/**
 * Copyright 2019 Association for the promotion of open-source insurance software and for the establishment of open interface standards in the insurance industry (Verein zur Förderung quelloffener Versicherungssoftware und Etablierung offener Schnittstellenstandards in der Versicherungsbranche)
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
package org.aposin.licensescout.finder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Represents an entry from a JAR file.
 * 
 * <p>Holds the content of the entry in a byte array.</p>
 * 
 */
public class JarEntryContainer implements EntryContainer {

    private final byte[] contents;

    /**
     * Constructor.
     * @param contents
     */
    public JarEntryContainer(final byte[] contents) {
        if (contents.length == 0) {
            throw new IllegalArgumentException("contents length must not be zero");
        }
        this.contents = contents;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final InputStream getInputStream() {
        return new ByteArrayInputStream(contents);
    }
}