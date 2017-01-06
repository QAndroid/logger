package com.orhanobut.logger;

/**
 * 日志适配器接口，定义了日志适配器的接口方法
 */
public interface LogAdapter {
  void d(String tag, String message);

  void e(String tag, String message);

  void w(String tag, String message);

  void i(String tag, String message);

  void v(String tag, String message);

  void wtf(String tag, String message);
}