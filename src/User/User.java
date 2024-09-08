package User;

public class User {
    public static int countOfFollowerForAllUsers;
    public static int postOfFollowerForAllUser;
    public static int commentOfFollowerAllUser;
    public String userName;
    public String mail;
    public int countOfFollowers;

    public User(String userName, String mail){
        this.userName = userName;
        this.mail = mail;
    }

    public int addFollower(){
        return ++countOfFollowers;
    }

    public int addPost(){
        return ++postOfFollowerForAllUser;
    }

    public int addComment(){
        return ++commentOfFollowerAllUser;
    }

    public void printDetails(){
        System.out.println("User full name: " +userName);
        System.out.println("Email:" + mail);
        System.out.println("Count of followers: " + countOfFollowers);
        System.out.println("Post of follower: " + postOfFollowerForAllUser);
        System.out.println("Comment of follower: " + commentOfFollowerAllUser);
    }
}


