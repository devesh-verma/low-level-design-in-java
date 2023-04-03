"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const ErrorLogProcessor_1 = __importDefault(require("./ErrorLogProcessor"));
const InfoLogProcessor_1 = __importDefault(require("./InfoLogProcessor"));
const LogProcessor_1 = __importDefault(require("./LogProcessor"));
const WarnLogProcessor_1 = __importDefault(require("./WarnLogProcessor"));
class Main {
    static main() {
        let logObject = new InfoLogProcessor_1.default(new WarnLogProcessor_1.default(new ErrorLogProcessor_1.default(null)));
        logObject.log(LogProcessor_1.default.INFO, "this is a info log");
        logObject.log(LogProcessor_1.default.WARN, "this is a warn log");
        logObject.log(LogProcessor_1.default.ERROR, "this is a error log");
    }
}
Main.main();
//# sourceMappingURL=index.js.map