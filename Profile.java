public class Profile {
    String nama(){
        return "Apri Supandi Pasaribu";
    }
    String NIM(){
        return "12350113279";
    }
    String hobi(){
        return "Bermian game, belajar, menonton film, and membaca komik";
    }
    public static void main(String[] args) {
        Profile profile = new Profile();
        System.out.println("Nama\t: " + profile.nama());
        System.out.println("NIM \t: " + profile.NIM());
        System.out.println("Hobi \t: " + profile.hobi());
    }
}
