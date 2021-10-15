package data;

import java.util.List;
import java.util.Map;

public class Bean {
    private String BeanId;
    private String BeanType;
    private Map<String,Object> property;

    public String getBeanId() {
        return BeanId;
    }

    public void setBeanId(String beanId) {
        BeanId = beanId;
    }

    public String getBeanType() {
        return BeanType;
    }

    public void setBeanType(String beanType) {
        BeanType = beanType;
    }

    public Map<String, Object> getProperty() {
        return property;
    }

    public void setProperty(Map<String, Object> property) {
        this.property = property;
    }
}
