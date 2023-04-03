abstract class LogProcessor {
  public static INFO: number = 1;
  public static WARN: number = 2;
  public static ERROR: number = 3;

  nextLogProcessor: LogProcessor | null;

  constructor(loggerProcessor: LogProcessor | null) {
    this.nextLogProcessor = loggerProcessor;
  }

  log(logLevel: number, message: string): void {
    if (this.nextLogProcessor !== null) {
      this.nextLogProcessor.log(logLevel, message);
    }
  }
}

export default LogProcessor;
