import LogProcessor from "./LogProcessor";

class WarnLogProcessor extends LogProcessor {
  constructor(nextLogProcessor: LogProcessor) {
    super(nextLogProcessor);
  }

  log(logLevel: number, message: string): void {
    if (logLevel === LogProcessor.WARN) {
      console.log("WARN: ", message);
    } else {
      super.log(logLevel, message);
    }
  }
}

export default WarnLogProcessor;
