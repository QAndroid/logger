package com.orhanobut.logger;

/**
 * Logger是android.util.Log的一个包装，但是它更好，更简单和更强大
 */
public final class Logger {
  //日志输出级别
  public static final int DEBUG = 3;
  public static final int ERROR = 6;
  public static final int ASSERT = 7;
  public static final int INFO = 4;
  public static final int VERBOSE = 2;
  public static final int WARN = 5;
  //日志输出默认tag
  private static final String DEFAULT_TAG = "PRETTYLOGGER";
  //打印日志类
  private static Printer printer = new LoggerPrinter();

  //没有实例
  private Logger() {
  }

  /**
   * 为了修改设置，获取Settings对象
   */
  public static Settings init() {
    return init(DEFAULT_TAG);
  }

  /**
   * 改变日志输出tag
   */
  public static Settings init(String tag) {
    printer = new LoggerPrinter();
    return printer.init(tag);
  }

  public static void resetSettings() {
    printer.resetSettings();
  }

  public static Printer t(String tag) {
    return printer.t(tag, printer.getSettings().getMethodCount());
  }

  public static Printer t(int methodCount) {
    return printer.t(null, methodCount);
  }

  public static Printer t(String tag, int methodCount) {
    return printer.t(tag, methodCount);
  }

  public static void log(int priority, String tag, String message, Throwable throwable) {
    printer.log(priority, tag, message, throwable);
  }

  /**
   * 输出debug日志
   */
  public static void d(String message, Object... args) {
    printer.d(message, args);
  }

  public static void d(Object object) {
    printer.d(object);
  }

  public static void e(String message, Object... args) {
    printer.e(null, message, args);
  }

  public static void e(Throwable throwable, String message, Object... args) {
    printer.e(throwable, message, args);
  }

  public static void i(String message, Object... args) {
    printer.i(message, args);
  }

  public static void v(String message, Object... args) {
    printer.v(message, args);
  }

  public static void w(String message, Object... args) {
    printer.w(message, args);
  }

  public static void wtf(String message, Object... args) {
    printer.wtf(message, args);
  }

  /**
   * Formats the json content and print it
   *
   * @param json the json content
   */
  public static void json(String json) {
    printer.json(json);
  }

  /**
   * Formats the json content and print it
   *
   * @param xml the xml content
   */
  public static void xml(String xml) {
    printer.xml(xml);
  }

}
