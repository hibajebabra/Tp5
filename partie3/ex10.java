package partie3;

class User {

    String nom;
}

class Repository<T> {

    void save(T obj) {

        System.out.println("objet eneregisterer");
    }
}

class UserRepository
        extends Repository<User> {

}

public class ex10 {

    public static void main(String[] args) {

        UserRepository ur =
                new UserRepository();

        ur.save(new User());
    }
}