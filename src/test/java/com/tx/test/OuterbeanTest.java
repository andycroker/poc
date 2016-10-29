package com.tx.test;

import org.junit.Test;

import com.tx.test.impl.OuterBeanImpl;

public class OuterbeanTest
{
  OuterBean testBean;

  @Test
  public void testReqiresNewRollsbackSuccessfully()
  {

    testBean = new OuterBeanImpl();
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
