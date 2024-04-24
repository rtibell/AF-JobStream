package se.consid.milvus.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import se.consid.milvus.server.JobStreamServer;

@Component
@Slf4j
public class ScheduledTasks {
    @Autowired
    private JobStreamServer jobStreamServer;

    // Runs every 120 seconds
    @Scheduled(fixedRate = 120000)
    public void taskWithFixedRate() {
        log.info("Fixed Rate Task :: Execution Time - {}", System.currentTimeMillis() / 1000);
        jobStreamServer.fetchNextInJobInStream().subscribe(jobListings -> {
            jobListings.stream().forEach(jobListing -> {
                log.info("Job Listing: {} - {} {}", jobListing.getId(), jobListing.getApplication_deadline(), jobListing.getHeadline());
            });
        });
    }

    // Runs 60 seconds after the previous task has finished
    @Scheduled(fixedDelay = 60000)
    public void taskWithFixedDelay() {
        log.info("Fixed Delay Task :: Execution Time - {}", System.currentTimeMillis() / 1000);
        try {
            Thread.sleep(2000); // Simulates a longer task of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Runs daily at 17:15 AM
    @Scheduled(cron = "0 15 17 * * ?")
    public void taskWithCronExpression() {
        log.info("Cron Task :: Execution Time - {}", System.currentTimeMillis() / 1000);
    }
}
