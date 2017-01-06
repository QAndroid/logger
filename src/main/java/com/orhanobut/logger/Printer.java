package com.orhanobut.logger;

/**
 * 日志打印接口，定义了打印日志接口方法
 */
public interface Printer {

  /**
   * 设置日志输出的标识和方法的个数
   */
  Printer t(String tag, int methodCount);

  Settings init(String tag);

  Settings getSettings();

  void d(String message, Object... args);

  void d(Object object);

  void e(String message, Object... args);

  void e(Throwable throwable, String message, Object... args);

  void w(String message, Object... args);

  void i(String message, Object... args);

  void v(String message, Object... args);

  void wtf(String message, Object... args);

  void json(String json);

  void xml(String xml);

  void log(int priority, String tag, String message, Throwable throwable);

  /**
   * 重置日志设置
   */
  void resetSettings();
}
