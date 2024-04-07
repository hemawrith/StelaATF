/*
package com.endava.atf.Logger;

import com.endava.qa.intership.niva.enums.LogType;
import com.endava.qa.intership.niva.report.ReportGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.log4j.Level.INFO;

public class CommonLogger {





        private static final Logger log = LoggerFactory.getLogger(CommonLogger.class);

        public void log(String message, LogType logType) {
            switch (logType) {
                case INFO:
                    ReportGenerator.logInfo(message);
                    log.info(message);
                    break;
                case PASS:
                    ReportGenerator.logPass(message);
                    log.info(message);
                    break;
                case FAIL:
                    ReportGenerator.logFail(message);
                    log.error(message);
                    break;
                case ERROR:
                    ReportGenerator.logError(message);
                    log.error(message);
                    break;
                case UNKNOWN:
                    ReportGenerator.logUnknown(message);
                    log.warn(message);
                    break;
                case SKIP:
                    ReportGenerator.logSkip(message);
                    log.warn(message);
                    break;
            }
        }
    }

*/
