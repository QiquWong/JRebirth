/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2016
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
package org.jrebirth.af.api.component.factory;

import org.jrebirth.af.api.annotation.PriorityLevel;
import org.jrebirth.af.api.component.basic.Component;

/**
 * The class <strong>RegistrationItem</strong> allow to store registration information.
 *
 * @author Sébastien Bordes
 */
public interface RegistrationItem extends Comparable<RegistrationItem> {

    /**
     * Return the interface class implemented by the registered class.
     *
     * @return Returns the interfaceClass.
     */
    Class<? extends Component<?>> interfaceClass();

    /**
     * Set the interface class implemented by the registered class.
     *
     * @param interfaceClass The interfaceClass to set.
     *
     * @return the current RegistrationItem
     */
    RegistrationItem interfaceClass(final Class<? extends Component<?>> interfaceClass);

    /**
     * Return the implementation class.
     *
     * @return Returns the implClass.
     */
    Class<? extends Component<?>> implClass();

    /**
     * Set the implementation class.
     *
     * @param implClass The implementation Class to set.
     *
     * @return the current RegistrationItem
     */
    RegistrationItem implClass(final Class<? extends Component<?>> implClass);

    /**
     * Return the registration priority level.
     *
     * @return Returns the priority.
     */
    PriorityLevel priority();

    /**
     * Set the registration priority level.
     *
     * @param priority The priority level to set.
     *
     * @return the current RegistrationItem
     */
    RegistrationItem priority(final PriorityLevel priority);

    /**
     * Return the registration priority weight.
     *
     * @return Returns the weight.
     */
    int weight();

    /**
     * Set the registration priority weight.
     *
     * @param weight The weight to set.
     *
     * @return the current RegistrationItem
     */
    RegistrationItem weight(final int weight);

}
