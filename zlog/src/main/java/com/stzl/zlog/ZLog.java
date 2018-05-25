package com.stzl.zlog;



/**
 * Created by Steve on 2016/4/29.
 *
 */

public class ZLog {


    private static Printer printer = new Printer();

    public static Printer t(String tag){
       return printer.t(tag);
    }

    public static void v(String format, Object... args) {
        printer.v(format,args);
    }

    public static void i(String format,Object... args){
        printer.i(format,args);
    }

    public static void d(String format, Object... args) {
        printer.d(format,args);
    }

    public static void e(String format, Object... args) {
        printer.e(format,args);
    }

    public static void e(Throwable tr, String format, Object... args) {
        printer.e(tr,format,args);
    }

    public static void w(String format, Object... args) {
        printer.w(format,args);
    }

    public static void w(Throwable tr, String format, Object... args) {
        printer.w(tr,format,args);
    }


    public static void printException(Throwable e){
        printer.printException(e);
    }

    public static void v(String tag, String message) {
        t(tag).v(message);
    }

    public static void i(String tag, String message){
        t(tag).i(message);
    }

    public static void d(String tag, String message) {
        t(tag).d(message);
    }

    public static void e(String tag, String message) {
        t(tag).e(message);
    }


    public static void w(String tag, String message) {
        t(tag).w(message);
    }


    public static void printException(String tag, Throwable e){
        t(tag).printException(e);
    }

}
