package edu.uci.ics.crawler4j.util

import edu.uci.ics.crawler4j.util.Util
import spock.lang.Specification

class UtilTest extends Specification {
    
    def "can determine binary audio content"() {
        given: 
            final String contentType = "IIAUDioH"
        when: 
            final boolean retval = Util.hasBinaryContent(contentType)
        then:
            retval == true
    }

    def "can determine binary video content"() {
        given: 
            final String contentType = "IeVvIDEOG"
        when: 
            final boolean retval = Util.hasBinaryContent(contentType)
        then:
            retval == true
    }

    def "can determine non-binary content"() {
        given: 
            final String contentType = "I\$EoI\$|VG"
        when: 
            final boolean retval = Util.hasBinaryContent(contentType)
        then:
            retval == false
    }

    def "can determine plain text content"() {
        given: 
            final String contentType = "tEXTTEXTB"
        when: 
            final boolean retval = Util.hasPlainTextContent(contentType)
        then:
            retval == true
    }

    def "can determine non-plain text content"() {
        given: 
            final String contentType = "dyUEEEE"
        when: 
            final boolean retval = Util.hasPlainTextContent(contentType)
        then:
            retval == false
    }
}
