public class Profile {
    String nama(){
        return "Apri Supandi Pasaribu";
    }
    String NIM(){
        return "12350113279";
    }

    public static void main(String[] args) {
        Profile profile = new Profile();
        System.out.println("Nama\t: " + profile.nama());
        System.out.println("NIM \t: " + profile.NIM());
    }
}
