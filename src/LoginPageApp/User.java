package LoginPageApp;

//2-adim: user objesini hazirlayalim

//POJO:Plain Old Java Objects
//fieldlar:private
//construction
//getter-setter
//toString

public class User {

    //ad-soyad,email,parola

    private String name; //null

    private String email; //null

    private String password; //null

    //user objesi olusturuldugunda feildlar(variable) set edilmis olsun: parametreli costructor

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


    //getter - setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*    //3-adim uye olma
    public void register () {

    }*/


}
