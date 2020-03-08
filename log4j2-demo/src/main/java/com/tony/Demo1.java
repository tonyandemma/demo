package com.tony;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
    private final static Logger log = LogManager.getLogger(Demo1.class);
    public static void main(String[] args) {
//        Logger log = LogManager.getRootLogger();    // equals getLogger("")
//        LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        log.trace("this is trace log");
        log.debug("this is debug log");
        log.info("this is info log");
        log.warn("this is warn log");
        log.error("this is error log");
        log.fatal("this is fatal log");
        test();
    }

    public static void test() {
        log.traceEntry();
        log.error("this is error log");
        log.traceExit();
    }
}
