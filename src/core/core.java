package core;

import data.Bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class core {
    public static Map<Class,Object> cohm = new HashMap<>();
    public static Map<String,Object> sohm = new HashMap<>();

    public void DI(Bean bean){
        try {
            String className = bean.getBeanType();
            Class clazz = Class.forName(className);
            Object o = clazz.newInstance();
            sohm.put(bean.getBeanId(),o);
            cohm.put(clazz,o);
            Method[] ms = clazz.getMethods();
            for (Method m : ms){
                if (bean.getProperty().containsKey(m.getName())){
                    System.out.println(m.getName());
                    m.invoke(o,bean.getProperty().get(m.getName()));
                }
            }

        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
