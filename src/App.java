public class App {
    public static void main(String[] args) throws Exception {
        // create an object of profile class
        Profile  osaeidsProfile = new Profile();
        osaeidsProfile.name = "osaeid";
        osaeidsProfile.id = 2099403;
        osaeidsProfile.phoneNumber = "+44 0743 048 5098";
        osaeidsProfile.email = "osaeid@gmail.com";

        //print the profile details
        System.out.println("Name: "+osaeidsProfile.name);
        System.out.println("ID: "+osaeidsProfile.id);
        System.out.println("Phone-Number: "+osaeidsProfile.phoneNumber);
        System.out.println("Email: "+osaeidsProfile.email);
        System.out.println("==========================================");
        
    }
}
