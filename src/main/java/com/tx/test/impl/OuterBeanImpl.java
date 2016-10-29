package com.tx.test.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tx.test.InnerBean;
import com.tx.test.OuterBean;

@Service
public class OuterBeanImpl implements OuterBean
{

  @Autowired
  private InnerBean innerBean;

  public OuterBeanImpl()
  {
  };

  public void testRequired()
  {
    try
    {
      innerBean.testRequired();
    }
    catch (RuntimeException e)
    {
      // handle exception
    }
  }

  public void testRequiresNew()
  {
    try
    {
      innerBean.testRequiresNew();
    }
    catch (Exception e)
    {
      // handle exception
    }
  }

}
