package com.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tx.test.OuterBean;

public class Main
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    OuterBean testBean = (OuterBean) ctx.getBean("outerBeanImpl");

    try
    {
      testBean.testRequired();
    }
    catch (Exception e)
    {
      // catch exception raised from transaction rollback
    }

    testBean.testRequiresNew();

  }
}
