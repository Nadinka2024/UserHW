import User.User;

    public class Main {
        public static void main(String[] args) {
            User zeroUser = new User( "Vitold", "vitold@gmail.com");
            User secondUser = new User ("Bonie", "bonie@gmail.com");

            zeroUser.addFollower();
            zeroUser.addFollower();
            secondUser.addFollower();
            zeroUser.addPost();
            zeroUser.addPost();
            secondUser.addComment();
            secondUser.addComment();

            System.out.println("Common count of followers" + User.countOfFollowerForAllUsers);
            zeroUser.printDetails();
            secondUser.printDetails();
        }
}