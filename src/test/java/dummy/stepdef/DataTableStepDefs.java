package dummy.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import java.util.List;

public class DataTableStepDefs {
    @Given("my credentials")
    public void myCredentials(DataTable datatable) {
        List<String> creds = datatable.values();
        System.out.println("USERNAME " + creds.get(0));
        System.out.println("PASSWORD " + creds.get(1));
    }
}
