package com.orhanobut.logger;

/**
 * 设置类
 */
public final class Settings {
  //方法的个数
  private int methodCount = 2;
  //是否显示线程信息
  private boolean showThreadInfo = true;
  private int methodOffset = 0;
  //日志适配器对象
  private LogAdapter logAdapter;


  //决定了是否输出日志
  private LogLevel logLevel = LogLevel.FULL;

  /**
   * 是否隐藏线程信息
   */
  public Settings hideThreadInfo() {
    showThreadInfo = false;
    return this;
  }

  /**
   * 堆栈方法个数
   */
  public Settings methodCount(int methodCount) {
    //检查参数合法性
    if (methodCount < 0) {
      methodCount = 0;
    }

    this.methodCount = methodCount;
    return this;
  }

  /**
   * 设置日志级别
   */
  public Settings logLevel(LogLevel logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  public Settings methodOffset(int offset) {
    this.methodOffset = offset;
    return this;
  }

  /**
   * 设置日志适配器
     */
  public Settings logAdapter(LogAdapter logAdapter) {
    this.logAdapter = logAdapter;
    return this;
  }

  public int getMethodCount() {
    return methodCount;
  }

  public boolean isShowThreadInfo() {
    return showThreadInfo;
  }

  public LogLevel getLogLevel() {
    return logLevel;
  }

  public int getMethodOffset() {
    return methodOffset;
  }

  public LogAdapter getLogAdapter() {
    if (logAdapter == null) {
      logAdapter = new AndroidLogAdapter();
    }
    return logAdapter;
  }

  /**
   * 充值日志适配器
   */
  public void reset() {
    methodCount = 2;
    methodOffset = 0;
    showThreadInfo = true;
    logLevel = LogLevel.FULL;
  }
}
