package loc.abondarev.camunda.javaapp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

    @Override
    public void execute(DelegateExecution delegateExecution) {
        LOGGER.info(String.format("Processing request by %s ...", delegateExecution.getVariable("customerId")));
    }
}
