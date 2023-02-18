def call(String logType, String message) {

    if (logType == "info") {
        echo "INFO: ${message}"
    } else if (logType == "warning") {
        echo "WARN: ${message}"
    } else if (logType == "debug") {
        echo "DEBUG: ${message}"
    } else if (logType == "error") {
        echo "ERROR: ${message}"
    } else if (logType == "trace") {
        echo "TRACE: ${message}"
    } else if (logType == "fatal") {
        echo "FATAL: ${message}"
    }

}
