"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class LogProcessor {
    constructor(loggerProcessor) {
        this.nextLogProcessor = loggerProcessor;
    }
    log(logLevel, message) {
        if (this.nextLogProcessor !== null) {
            this.nextLogProcessor.log(logLevel, message);
        }
    }
}
LogProcessor.INFO = 1;
LogProcessor.WARN = 2;
LogProcessor.ERROR = 3;
exports.default = LogProcessor;
//# sourceMappingURL=LogProcessor.js.map