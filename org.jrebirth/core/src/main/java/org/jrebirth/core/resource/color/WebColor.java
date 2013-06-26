/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
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
package org.jrebirth.core.resource.color;

/**
 * The class <strong>WebColor</strong> used to create a Web Color.
 * 
 * @author Sébastien Bordes
 */
public class WebColor extends AbstractBaseColor {

    /** The hexadecimal string value [0-9A-F]{6} (without 0x or #). */
    private final String hex;

    /**
     * Default Constructor.
     * 
     * @param hex the hexadecimal value [0-9A-F]{6} (without 0x or #)
     */
    public WebColor(final String hex) {
        super();
        this.hex = hex;
    }

    /**
     * Default Constructor.
     * 
     * @param hex the hexadecimal value [0-9A-F]{6} (without 0x or #)
     * @param opacity the color opacity [0.0-1.0]
     */
    public WebColor(final String hex, final double opacity) {
        super(opacity);
        this.hex = hex;
    }

    /**
     * Return the hexadecimal string value [0-9A-F]{6} (without 0x or #).
     * 
     * @return Returns the hexadecimal value.
     */
    public String hex() {
        return this.hex;
    }

}
