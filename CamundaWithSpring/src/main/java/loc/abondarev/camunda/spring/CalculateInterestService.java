package loc.abondarev.camunda.spring;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateInterestService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        String activityInstanceId = delegateExecution.getActivityInstanceId();
        System.out.println(activityInstanceId);
        System.out.println("Spring Bean invoked");
    }
}
