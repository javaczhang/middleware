package com.redcore.rn.demo;

import android.app.Application;

import com.redcore.yunshipei.core.util.AppModuleUtil;

public class MainApplication extends Application  {



    @Override
    public void onCreate() {
        super.onCreate();
//        SoLoader.init(this, /* native exopackage */ false);

      AppModuleUtil.init(getApplicationContext());
    }


}
