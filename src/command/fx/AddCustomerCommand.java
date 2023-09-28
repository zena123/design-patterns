package command.fx;

public class AddCustomerCommand implements Command{
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void excecute() {
        // TODO Auto-generated method stub
        customerService.addCustomer();
        
    }
    
}
