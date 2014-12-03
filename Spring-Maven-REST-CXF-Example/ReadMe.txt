Bind the Data object i.e. BookVO with request and response
============================================================

To bind the BookVO with the request or response it needs to serialized into either XML or JSON streams.
The serialization needs to be done using one of the data binding components. 
CXF uses JAXB for default data binding component. 
JaXB uses @XmlRootElement annotation to map the data object to the xml. 


    @POST – This indicates that service receives only POST request.
    @Path – This is the path of webservice. So the webservice can be invoked using following Url <base_url>/bookservice/getbook/{name} for fetching, <base_url>/bookservice/addbook for adding.
    @Produces – Indicates the MIME type of response generated. In our case it is both application/xml and application/json.
    @Consumes – Indicates the MIME type of request which this service can consume.