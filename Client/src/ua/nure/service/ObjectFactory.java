
package ua.nure.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.nure.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoubleEcho_QNAME = new QName("http://service.nure.ua/", "doubleEcho");
    private final static QName _GetInventoryById_QNAME = new QName("http://service.nure.ua/", "getInventoryById");
    private final static QName _GetPriceInHourById_QNAME = new QName("http://service.nure.ua/", "getPriceInHourById");
    private final static QName _GetYearInADayByIdResponse_QNAME = new QName("http://service.nure.ua/", "getYearInADayByIdResponse");
    private final static QName _GetIntentoryListResponse_QNAME = new QName("http://service.nure.ua/", "getIntentoryListResponse");
    private final static QName _DoubleEchoResponse_QNAME = new QName("http://service.nure.ua/", "doubleEchoResponse");
    private final static QName _GetIntentoryList_QNAME = new QName("http://service.nure.ua/", "getIntentoryList");
    private final static QName _GetYearInADayById_QNAME = new QName("http://service.nure.ua/", "getYearInADayById");
    private final static QName _ParseXMLResponse_QNAME = new QName("http://service.nure.ua/", "parseXMLResponse");
    private final static QName _GetPriceInADayByIdResponse_QNAME = new QName("http://service.nure.ua/", "getPriceInADayByIdResponse");
    private final static QName _ParseXML_QNAME = new QName("http://service.nure.ua/", "parseXML");
    private final static QName _GetPriceInHourByIdResponse_QNAME = new QName("http://service.nure.ua/", "getPriceInHourByIdResponse");
    private final static QName _Exception_QNAME = new QName("http://service.nure.ua/", "Exception");
    private final static QName _GetInventoryByIdResponse_QNAME = new QName("http://service.nure.ua/", "getInventoryByIdResponse");
    private final static QName _GetPriceInADayById_QNAME = new QName("http://service.nure.ua/", "getPriceInADayById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.nure.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoubleEchoResponse }
     * 
     */
    public DoubleEchoResponse createDoubleEchoResponse() {
        return new DoubleEchoResponse();
    }

    /**
     * Create an instance of {@link GetIntentoryList }
     * 
     */
    public GetIntentoryList createGetIntentoryList() {
        return new GetIntentoryList();
    }

    /**
     * Create an instance of {@link GetYearInADayById }
     * 
     */
    public GetYearInADayById createGetYearInADayById() {
        return new GetYearInADayById();
    }

    /**
     * Create an instance of {@link ParseXMLResponse }
     * 
     */
    public ParseXMLResponse createParseXMLResponse() {
        return new ParseXMLResponse();
    }

    /**
     * Create an instance of {@link GetPriceInADayByIdResponse }
     * 
     */
    public GetPriceInADayByIdResponse createGetPriceInADayByIdResponse() {
        return new GetPriceInADayByIdResponse();
    }

    /**
     * Create an instance of {@link ParseXML }
     * 
     */
    public ParseXML createParseXML() {
        return new ParseXML();
    }

    /**
     * Create an instance of {@link GetPriceInHourByIdResponse }
     * 
     */
    public GetPriceInHourByIdResponse createGetPriceInHourByIdResponse() {
        return new GetPriceInHourByIdResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetInventoryByIdResponse }
     * 
     */
    public GetInventoryByIdResponse createGetInventoryByIdResponse() {
        return new GetInventoryByIdResponse();
    }

    /**
     * Create an instance of {@link GetPriceInADayById }
     * 
     */
    public GetPriceInADayById createGetPriceInADayById() {
        return new GetPriceInADayById();
    }

    /**
     * Create an instance of {@link DoubleEcho }
     * 
     */
    public DoubleEcho createDoubleEcho() {
        return new DoubleEcho();
    }

    /**
     * Create an instance of {@link GetInventoryById }
     * 
     */
    public GetInventoryById createGetInventoryById() {
        return new GetInventoryById();
    }

    /**
     * Create an instance of {@link GetPriceInHourById }
     * 
     */
    public GetPriceInHourById createGetPriceInHourById() {
        return new GetPriceInHourById();
    }

    /**
     * Create an instance of {@link GetYearInADayByIdResponse }
     * 
     */
    public GetYearInADayByIdResponse createGetYearInADayByIdResponse() {
        return new GetYearInADayByIdResponse();
    }

    /**
     * Create an instance of {@link GetIntentoryListResponse }
     * 
     */
    public GetIntentoryListResponse createGetIntentoryListResponse() {
        return new GetIntentoryListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleEcho }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "doubleEcho")
    public JAXBElement<DoubleEcho> createDoubleEcho(DoubleEcho value) {
        return new JAXBElement<DoubleEcho>(_DoubleEcho_QNAME, DoubleEcho.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getInventoryById")
    public JAXBElement<GetInventoryById> createGetInventoryById(GetInventoryById value) {
        return new JAXBElement<GetInventoryById>(_GetInventoryById_QNAME, GetInventoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceInHourById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getPriceInHourById")
    public JAXBElement<GetPriceInHourById> createGetPriceInHourById(GetPriceInHourById value) {
        return new JAXBElement<GetPriceInHourById>(_GetPriceInHourById_QNAME, GetPriceInHourById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYearInADayByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getYearInADayByIdResponse")
    public JAXBElement<GetYearInADayByIdResponse> createGetYearInADayByIdResponse(GetYearInADayByIdResponse value) {
        return new JAXBElement<GetYearInADayByIdResponse>(_GetYearInADayByIdResponse_QNAME, GetYearInADayByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntentoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getIntentoryListResponse")
    public JAXBElement<GetIntentoryListResponse> createGetIntentoryListResponse(GetIntentoryListResponse value) {
        return new JAXBElement<GetIntentoryListResponse>(_GetIntentoryListResponse_QNAME, GetIntentoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleEchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "doubleEchoResponse")
    public JAXBElement<DoubleEchoResponse> createDoubleEchoResponse(DoubleEchoResponse value) {
        return new JAXBElement<DoubleEchoResponse>(_DoubleEchoResponse_QNAME, DoubleEchoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntentoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getIntentoryList")
    public JAXBElement<GetIntentoryList> createGetIntentoryList(GetIntentoryList value) {
        return new JAXBElement<GetIntentoryList>(_GetIntentoryList_QNAME, GetIntentoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYearInADayById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getYearInADayById")
    public JAXBElement<GetYearInADayById> createGetYearInADayById(GetYearInADayById value) {
        return new JAXBElement<GetYearInADayById>(_GetYearInADayById_QNAME, GetYearInADayById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "parseXMLResponse")
    public JAXBElement<ParseXMLResponse> createParseXMLResponse(ParseXMLResponse value) {
        return new JAXBElement<ParseXMLResponse>(_ParseXMLResponse_QNAME, ParseXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceInADayByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getPriceInADayByIdResponse")
    public JAXBElement<GetPriceInADayByIdResponse> createGetPriceInADayByIdResponse(GetPriceInADayByIdResponse value) {
        return new JAXBElement<GetPriceInADayByIdResponse>(_GetPriceInADayByIdResponse_QNAME, GetPriceInADayByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "parseXML")
    public JAXBElement<ParseXML> createParseXML(ParseXML value) {
        return new JAXBElement<ParseXML>(_ParseXML_QNAME, ParseXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceInHourByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getPriceInHourByIdResponse")
    public JAXBElement<GetPriceInHourByIdResponse> createGetPriceInHourByIdResponse(GetPriceInHourByIdResponse value) {
        return new JAXBElement<GetPriceInHourByIdResponse>(_GetPriceInHourByIdResponse_QNAME, GetPriceInHourByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getInventoryByIdResponse")
    public JAXBElement<GetInventoryByIdResponse> createGetInventoryByIdResponse(GetInventoryByIdResponse value) {
        return new JAXBElement<GetInventoryByIdResponse>(_GetInventoryByIdResponse_QNAME, GetInventoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceInADayById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nure.ua/", name = "getPriceInADayById")
    public JAXBElement<GetPriceInADayById> createGetPriceInADayById(GetPriceInADayById value) {
        return new JAXBElement<GetPriceInADayById>(_GetPriceInADayById_QNAME, GetPriceInADayById.class, null, value);
    }

}
