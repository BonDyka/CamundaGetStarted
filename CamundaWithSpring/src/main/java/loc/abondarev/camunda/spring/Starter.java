package loc.abondarev.camunda.spring;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {
    @Autowired
    private RuntimeService runtimeService;

    @Override
    public void afterPropertiesSet() {
        runtimeService.startProcessInstanceByKey("loanApproval");
    }

    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}
