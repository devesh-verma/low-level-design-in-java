import ErrorLogProcessor from "./ErrorLogProcessor";
import InfoLogProcessor from "./InfoLogProcessor";
import LogProcessor from "./LogProcessor";
import WarnLogProcessor from "./WarnLogProcessor";

class Main {
  static main() {
    let logObject: LogProcessor = new InfoLogProcessor(
      new WarnLogProcessor(new ErrorLogProcessor(null))
    );
    logObject.log(LogProcessor.INFO, "this is a info log");
    logObject.log(LogProcessor.WARN, "this is a warn log");
    logObject.log(LogProcessor.ERROR, "this is a error log");
  }
}

Main.main();
