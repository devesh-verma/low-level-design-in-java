"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const LogProcessor_1 = __importDefault(require("./LogProcessor"));
class InfoLogProcessor extends LogProcessor_1.default {
    constructor(nextLogProcessor) {
        super(nextLogProcessor);
    }
    log(logLevel, message) {
        if (logLevel === LogProcessor_1.default.INFO) {
            console.log("INFO: ", message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
exports.default = InfoLogProcessor;
//# sourceMappingURL=InfoLogProcessor.js.map