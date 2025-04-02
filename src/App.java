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

        MarkSheet osaeidMarkSheet = new MarkSheet();
        osaeidMarkSheet.maths = 90;
        osaeidMarkSheet.english = 90;
        osaeidMarkSheet.history = 89;
        //calculate the total score and percentage
        double totalMarkScore = osaeidMarkSheet.maths + osaeidMarkSheet.english + osaeidMarkSheet.history;
        //the formula of a percentage is (marks. / total marks)*100
        double percentage = (totalMarkScore/300)*100;
        

        System.out.println("Maths Score: " + osaeidMarkSheet.maths);
        System.out.println("English Score: " + osaeidMarkSheet.english);
        System.out.println("History Score: " + osaeidMarkSheet.history);
        System.out.println("Total Marks: " + totalMarkScore);
        System.out.println("Percentage in all subjects: " + percentage + "%");
        System.out.println("==========================================");
    }
}
