package ganymede.log4j;

import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author Brandon
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Log4jLineNumber implements Log4jItem {
	
	private LoggingEvent le;
	
	public Log4jLineNumber(LoggingEvent event) {
		le = event;
	}

    /**
     * @see ganymede.log4j.Log4jItem#getText()
     */
    public String getText() {
    	LocationInfo location = le.getLocationInformation();
        if ( location == null ) {
        	return "";
        } else {
        	return location.getLineNumber();
        }
    }

}