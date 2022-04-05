package Service;


public class DPIStudentServiceMsg extends DPISystemServices{

    // Greetings message
    @Override
    public void greeting_message()
    {
        System.out.println("\nWelcome to DPI Student Services !!!");
    }

    // Ending message
    @Override
    public void terminate_message()
    {
        System.out.println("Terminating Student Services");
    }

    // Student Services
    @Override
    public void service_information()
    {
        System.out.println(
                "\nStudent Services: \n" +
                        "# Press 1 for Create Information\n" +
                        "# Press 2 for Read Information\n" +
                        "# Press 3 for Update Information\n" +
                        "# Press 4 for Delete Information\n" +
                        "# Press 0 for Exit\n"
        );
    }
}
