package loc.abondarev.camunda.dmn;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

@ProcessApplication(name = "Dinner App DMN")
public class DinnerApplication extends ServletProcessApplication {
    //
    @PostDeploy
    public void evaluateDecisionTable(ProcessEngine processEngine) {
        DecisionService decisionService = processEngine.getDecisionService();

        VariableMap variabless = Variables.createVariables()
                .putValue("season", "Spring")
                .putValue("guestCount", 10);

        DmnDecisionTableResult dishDecisionResult = decisionService.evaluateDecisionTableByKey("dish", variabless);
        String desiredDish = dishDecisionResult.getSingleEntry();

        System.out.println(desiredDish);
    }
}
