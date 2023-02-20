package RealTimeApplication;


import java.util.Scanner;

class Youtube {
    String username;
    String title;
    public Youtube(String username) {
        this.username = username;
    }
}

class Video extends Youtube {
    String videoTitle;

    public Video(String username, String videoTitle) {
        super(username);
        this.videoTitle = videoTitle;
    }
    public void search() {
        System.out.println(username + " searching video for "+videoTitle);
    }
    public void playVideo() {
        System.out.println(username + " is playing "+ videoTitle+" video");
    }
    public void shareVideo() {
        System.out.println(username + " is sharing "+ videoTitle+" video");
    }
    public void commentVideo() {
        System.out.println(username + " is commenting on "+ videoTitle+" video");
    }
    public void likeVideo() {
        System.out.println(username + " is liking "+ videoTitle+" video" );
    }
    public void downloadVideo() {
        System.out.println(username + " is downloading " + videoTitle + "video" );
    }
    public void exit(){
        System.out.println(username+" is exiting from youtube");
    }
}
class MainYoutube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String name = sc.next();
        System.out.println("Enter video title to search:");
        String title = sc.next();
        Video pro=new Video(name,title);
        pro.search();
        boolean exit=false;
        while (!exit) {
            System.out.println("\nYouTube Menu");
            System.out.println("1.Play current video \n2.Share current video \n3.Comment on current video \n4.Like current video \n5.Download current video \n6.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    pro.playVideo();
                    break;
                case 2:
                    pro.shareVideo();
                    break;
                case 3:
                    pro.commentVideo();
                    break;
                case 4:
                    pro.likeVideo();
                    break;
                case 5:
                    pro.downloadVideo();
                    break;
                case 6:
                    exit = true;
                    pro.exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


