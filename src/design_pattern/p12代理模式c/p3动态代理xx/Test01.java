package design_pattern.p12代理模式c.p3动态代理xx;

import java.lang.reflect.Proxy;

/**
 * @author xm
 * @date 2021/9/17 19:44
 * @description:
 */
public class Test01 {

    public static void main(String[] args) {


        AMerchantServiceImplA aMerchantServiceImplA = new AMerchantServiceImplA();
        BMerchantServiceImplB bMerchantServiceImplB = new BMerchantServiceImplB();

        String name = "xxx";

        DCompany dCompany = new DCompany();
        dCompany.setObjFactory(aMerchantServiceImplA);
        ASellService proxyInstance = (ASellService) dCompany.getProxyInstance();
        proxyInstance.sale(name);
    }
}

