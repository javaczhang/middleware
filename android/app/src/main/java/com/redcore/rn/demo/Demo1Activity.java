package com.redcore.rn.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.redcore.yunshipei.core.activity.MyReactActivity;
import com.redcore.yunshipei.core.bean.AppList;
import com.redcore.yunshipei.core.rn.YSPRNSdkManager;

public class Demo1Activity extends AppCompatActivity implements View.OnClickListener {

  protected Button mB01;
  protected Button mB02;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.setContentView(R.layout.activity_demo1);
    //登录成功后初始化sdk
    YSPRNSdkManager.initSdk("pertest.redcore.cn", "http://pertest.redcore.cn/");
    YSPRNSdkManager.registerAllSdk(this);
    initView();
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.b01) {
//      正式poc中使用
//      AppList.Data.Apps app = YSPRNSdkManager.getCompanySiteMap().get("miniapp.redcore.cn").getApps().get(2);
      AppList.Data.Apps app = YSPRNSdkManager.getMiniAppWithDomainAndScope("miniapp.redcore.cn","RMAPlayground");
      YSPRNSdkManager.openNativeRNView(this, app);
    } else if (view.getId() == R.id.b02) {
      startActivity(new Intent(this, MyReactActivity.class).putExtra("assetName", "index.android.bundle"));
    }
  }

  private void initView() {
    mB01 = (Button) findViewById(R.id.b01);
    mB01.setOnClickListener(Demo1Activity.this);
    mB02 = (Button) findViewById(R.id.b02);
    mB02.setOnClickListener(Demo1Activity.this);
  }
}
