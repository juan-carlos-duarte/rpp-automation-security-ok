package com.rappi.pay.automation.gradle;
/*
THIS CLASS HELPS TO MANAGE CI CD INTEGRATION, EDIT CAREFULLY!!! */
import com.rappi.pay.automation.runner.TaskRunner;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;

@Slf4j
public class MetadataApplication {

    public static void main(String[] args) throws IOException {
        log.info("STARTING THE TASK");
        log.info("EXECUTING TASK ... {}", args[0]);
        new TaskRunner().run(args[0]);
        log.info("TASK FINISHED");
    }
}
