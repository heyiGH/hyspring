import core.core;
import data.Bean;
import data.User;
import javafx.beans.binding.ObjectBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Bean bean = new Bean();
        bean.setBeanId("heyi");
        bean.setBeanType("data.User");
        Map<String,Object> hm = new HashMap<>();
        hm.put("setName","heyi");
        hm.put("setAge",18);
        bean.setProperty(hm);

        core co = new core();
        co.DI(bean);
        System.out.println(core.cohm.get(User.class));


    }
}
