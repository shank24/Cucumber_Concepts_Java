package dummy.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import java.util.List;

public class DataTableStepDef {

    //With Cucumber DataTable
    /*@Given("my credentials")
    public void myCredentials(DataTable datatable) {
        List<List<String>> reds = datatable.asLists();
        extracted(reds);
    }*/

    //With Java Collection
    @Given("my credentials")
    public void myCredentials(List<List<String>> reds) {
        extracted(reds);
    }

    private void extracted(List<List<String>> reds) {
        for (int i=0; i<reds.size(); i++) {
            for (int j=0;j<reds.size();j++){
                System.out.println("VALUE " + reds.get(i).get(j));
            }
        }
    }
}
