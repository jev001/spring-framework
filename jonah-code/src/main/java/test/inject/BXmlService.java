package test.inject;

/**
 * @author Jonah
 * @date 2022-07-10
 * @since JDK1.8
 */
public class BXmlService {
    private AXmlService aXmlService;
    
    public AXmlService getaXmlService() {
        return aXmlService;
    }
    
    public void setaXmlService(AXmlService aXmlService) {
        this.aXmlService = aXmlService;
    }
}
