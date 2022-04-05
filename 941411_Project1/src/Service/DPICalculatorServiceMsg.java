package Service;


public class DPICalculatorServiceMsg extends DPISystemServices {

    @Override
    public void greeting_message() {
        System.out.println("This is our Calculator System");
    }

    @Override
    public void terminate_message() {
        System.out.println("Terminating Our Calculator System");
    }

    @Override
    public void service_information()
    {
        System.out.println(
                "\nCalculator Services: \n" +
                        "# Press 1 for Addition\n" +
                        "# Press 2 for Subtraction\n" +
                        "# Press 3 for Multiplication\n" +
                        "# Press 4 for Division\n" +
                        "# Press 0 for Exit\n"
        );
    }
}
