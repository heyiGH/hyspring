import javafx.beans.binding.ObjectBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Map<String, Object> beanFacorty = new HashMap<>();
        String className = "data.User";
        Map<String,Object> hm = new HashMap<>();
        hm.put("setName","heyi");               //xml 配置 name heyi
        hm.put("setAge",new Integer(18));//xml 配置 age  18
        Class clazz =  Class.forName(className);
        Object o = clazz.newInstance();
        beanFacorty.put(className,o);
        Method[] ms = clazz.getMethods();
        for (Method m : ms){
            if (hm.containsKey(m.getName())){
                System.out.println(m.getName());
                m.invoke(o,hm.get(m.getName()));
            }
        }
        System.out.println(o);
        System.out.println(beanFacorty.get("data.User"));



    }
}
