/*---------------------------------------------------------------------------*\
  $Id$
\*---------------------------------------------------------------------------*/

package org.clapper.util.config;

import java.util.*;

/**
 * A <tt>SectionExistsException</tt> is thrown by the
 * {@link ConfigurationParser} class to signify that a requested
 * configuration section already exists and cannot be created.
 *
 * @see NestedException
 *
 * @version <tt>$Revision$</tt>
 */
public class SectionExistsException extends Exception
{
    /*----------------------------------------------------------------------*\
                            Private Data Items
    \*----------------------------------------------------------------------*/

    private String sectionName = null;

    /*----------------------------------------------------------------------*\
                                Constructor
    \*----------------------------------------------------------------------*/

    /**
     * Constructs an exception.
     *
     * @param sectionName  the section name to which the exception pertains
     */
    public SectionExistsException (String sectionName)
    {
        super();

        this.sectionName = sectionName;
    }

    /*----------------------------------------------------------------------*\
                              Public Methods
    \*----------------------------------------------------------------------*/

    /**
     * Gets the section name associated with this exception.
     *
     * @return the section name
     */
    public String getSectionName()
    {
        return sectionName;
    }

    /**
     * Gets the message associated with this exception.
     *
     * @return the message
     */
    public String getMessage()
    {
        return this.getClass().getName() + ": section " + sectionName;
    }

    /**
     * Gets a string representation of this exception.
     *
     * @return the string representation
     */
    public String toString()
    {
        return getMessage();
    }
}
