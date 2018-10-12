package mealtracker;

public class User {
    public final String Uname;
    public final String Uemail;
    public double getTargetAdherence() {
        return 90;
    }
    User (String name, String email) {
        this.Uname = name;
        this.Uemail = email;
    }
    String getName() {
        return this.Uname;
    }

    String getEmail(){
        return this.Uemail;
    }



}