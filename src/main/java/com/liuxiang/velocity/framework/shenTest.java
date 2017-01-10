package com.liuxiang.velocity.framework;
/**
 * Created by shendepu on 2017/1/4.
 */
public class shenTest {
    public static void main(String args[]){
        String uri = "http://127.0.0.1:8096/teacherAction!teacherList.action";
        String actionAndMethod = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println("actionAndMethod: "+actionAndMethod);
        actionAndMethod = actionAndMethod.substring(0,actionAndMethod.lastIndexOf("."));
        System.out.println("actionAndMethod: "+actionAndMethod);
        String [] actionAndMethodArray = actionAndMethod.split("!");
        System.out.println("actionAndMethodArray: "+actionAndMethodArray);
        String actionName = actionAndMethodArray[0];
        System.out.println("actionName: "+actionName);


        if(actionAndMethodArray.length == 1){
            System.out.println("一个参数");

        }
        else
            System.out.println("methodName"+actionAndMethodArray[1]);

        System.out.println(actionAndMethodArray.length);

        System.out.println(1);
    }
}


//    HttpServletRequest req = (HttpServletRequest) request;
//    HttpServletResponse resp = (HttpServletResponse) response;
//    String uri = req.getRequestURI();
//    String actionAndMethod = uri.substring(uri.lastIndexOf("/") + 1);
//		actionAndMethod = actionAndMethod.substring(0,actionAndMethod.lastIndexOf("."));
//                String[] actionAndMethodArray = actionAndMethod.split("!");
//                String actionName = actionAndMethodArray[0];
//                String methodName = null;