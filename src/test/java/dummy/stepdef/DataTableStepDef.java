package dummy.stepdef;

import dummy.objects.Customer;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import java.util.List;
import java.util.Map;

public class DataTableStepDef {

    /*@DataTableType
    public Customer customerEntry(List<String> entry){
        return new Customer(entry.get(0), entry.get(1));
    }*/

    //With Java Collection
    @Given("my credentials")
    public void myCredentials(List<Map<String,String>> customers) {
        System.out.println("USERNAME " + customers.get(0).get("username"));
        System.out.println("PASSWORD " + customers.get(0).get("password"));
    }

    private void extracted(List<List<String>> reds) {
        for (int i=0; i<reds.size(); i++) {
            for (int j=0;j<reds.size();j++){
                System.out.println("VALUE " + reds.get(i).get(j));
            }
        }
    }


    //With Cucumber DataTable
    /*@Given("my credentials")
    public void myCredentials(DataTable datatable) {
        List<List<String>> reds = datatable.asLists();
        extracted(reds);
    }*/


    /*@Given("my credentials")
    public void myCredentials(List<Customer> customers) {
        System.out.println("ROW 0 USERNAME " + customers.get(0).getUsername());
        System.out.println("ROW 0 PASSWORD " + customers.get(0).getPassword());
        System.out.println("ROW 1 USERNAME " + customers.get(1).getUsername());
        System.out.println("ROW 1 PASSWORD " + customers.get(1).getPassword());

        //extracted(reds);
    }*/

}
