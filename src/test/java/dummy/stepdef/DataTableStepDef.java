package dummy.stepdef;

import dummy.objects.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableStepDef {

    @DataTableType
    public Customer customerEntry(List<String> entry){
        return new Customer(entry.get(0), entry.get(1));
    }


    @Given("my credentials")
    public void myCredentials(@Transpose Customer customer) {
        System.out.println("ROW 0 USERNAME " + customer.getUsername());
        System.out.println("ROW 0 PASSWORD " + customer.getPassword());
    }




    /*

    // Single Column With Header
    @Given("my credentials")
    public void myCredentials(Map<String, String> customer) {
        //Map<String, String> customer = datatable.asMap();
        System.out.println("ROW 0 USERNAME " + customer.get("username"));
        System.out.println("ROW 0 PASSWORD " + customer.get("password"));
    }


    //With Cucumber DataTable

    @Given("my credentials")
    public void myCredentials(DataTable datatable) {
        List<List<String>> reds = datatable.asLists();
        extracted(reds);
    }

    //With Customer Object

    @Given("my credentials")
    public void myCredentials(List<Customer> customers) {
        System.out.println("ROW 0 USERNAME " + customers.get(0).getUsername());
        System.out.println("ROW 0 PASSWORD " + customers.get(0).getPassword());
        System.out.println("ROW 1 USERNAME " + customers.get(1).getUsername());
        System.out.println("ROW 1 PASSWORD " + customers.get(1).getPassword());

    }

    //With List<Map<String, String>>

    @Given("my credentials")
    public void myCredentials(List<Map<String,String>> customers) {
        System.out.println("ROW 0 USERNAME " + customers.get(0).get("username"));
        System.out.println("ROW 0 USERNAME " + customers.get(0).get("password"));
        System.out.println("ROW 1 USERNAME " + customers.get(1).get("username"));
        System.out.println("ROW 1 PASSWORD " + customers.get(1).get("password"));
    }

    //With List<List<String>>
    private void extracted(List<List<String>> reds) {
        for (int i=0; i<reds.size(); i++) {
            for (int j=0;j<reds.size();j++){
                System.out.println("VALUE " + reds.get(i).get(j));
            }
        }
    }

    */

}
