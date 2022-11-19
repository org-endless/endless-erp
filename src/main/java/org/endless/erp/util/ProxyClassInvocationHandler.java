package org.endless.erp.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
*@ClassName ProxyClassInvocationHandler
*@Description 动态代理类执行处理工具模板，可为真实类接口动态生成代理类并执行处理，可处理一个类型的操作
*@Author EndlessError
*@Date 2022/11/19 14:02
*@Version
*/
public class ProxyClassInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxyClass() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
