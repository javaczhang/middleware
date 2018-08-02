package com.redcore.sdk;

import com.redcore.yunshipei.core.rn.YSPRNSdkManager;

public class MiddleWare {

  public boolean init(Object obj) {
    YSPRNSdkManager.initSdk("pertest.redcore.cn", "http://pertest.redcore.cn/");
    return false;
  }
}
