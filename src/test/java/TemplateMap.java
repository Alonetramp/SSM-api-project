package test.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static main.java.com.company.project.core.ProjectConstant.*;
import static main.java.com.company.project.core.ProjectConstant.CONTROLLER_PACKAGE;
import static main.java.com.company.project.core.ProjectConstant.SERVICE_IMPL_PACKAGE;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/4/24 0024 17:51
 */
public class TemplateMap {

    //模板中出现的变量
    private Map<String, Object> data;

    private static final String AUTHOR = "CodeGenerator";//@author
    private static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());//@date

    TemplateMap(){
        data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        data.put("basePackage", BASE_PACKAGE);
        data.put("modelPackage", MODEL_PACKAGE);//Model包名
        data.put("mapperPackage", MAPPER_PACKAGE);//Mapper包名
        data.put("servicePackage", SERVICE_PACKAGE);//Service包名
        data.put("serviceImplPackage", SERVICE_IMPL_PACKAGE);//ServiceImpl包名
        data.put("controllerPackage", CONTROLLER_PACKAGE);//Controller包名
    }

    public Map getDataMap(){
        return data;
    }

    public Map<String, Object> put(String string, Object object){
        data.put(string,object);
        return data;
    }

}
