package com.tx.test.impl;

import org.springframework.stereotype.Service;

import com.tx.test.InnerBean;

@Service
public class InnerBeanImpl implements InnerBean
{

  public void testRequired()
  {
    throw new RuntimeException("Rollback this transaction!");
  }

  public void testRequiresNew()
  {
    throw new RuntimeException("Rollback this transaction!");
  }

}
