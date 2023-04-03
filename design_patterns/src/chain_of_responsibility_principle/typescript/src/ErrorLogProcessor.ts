import LogProcessor from "./LogProcessor";

class ErrorLogProcessor extends LogProcessor {
  constructor(nextLogProcessor: LogProcessor | null) {
    super(nextLogProcessor);
  }

  log(logLevel: number, message: string): void {
    if (logLevel === LogProcessor.ERROR) {
      console.log("ERROR: ", message);
    } else {
      super.log(logLevel, message);
    }
  }
}

export default ErrorLogProcessor;
