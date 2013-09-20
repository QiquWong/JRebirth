/*
 * 
 */
package org.jrebirth.core.log;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * The class <strong>JRebirthMarkers</strong>.
 * 
 * Only 5 characters per marker name.
 * 
 * @author Sébastien Bordes
 */
public interface JRebirthMarkers {

    /** The default marker. */
    Marker EMPTY = MarkerFactory.getMarker("EMPTY");

    /** The Marker used by Application package. */
    Marker APPLICATION = MarkerFactory.getMarker("APPLI");

    /** The Marker used by Message Engine. */
    Marker MESSAGE = MarkerFactory.getMarker("MESSG");

    /** The Marker used by Parameter Engine. */
    Marker PARAMETER = MarkerFactory.getMarker("PARAM");

    /** The Marker used by JRebirth EventParameter Engine. */
    Marker JREVENT = MarkerFactory.getMarker("JREVT");

    /** The Marker used by JRebirth Concurrent layer. */
    Marker CONCURRENT = MarkerFactory.getMarker("CNCRT");

}
